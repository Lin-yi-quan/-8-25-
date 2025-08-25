# -8-25-
作業8/25上傳

謝謝老師看我的作業，<BR>
這次的作業報告是使用資料庫CRUD語法以及列印<BR>
還有把四張表和在一起(雖然這個失敗了)<BR>
//======================================================================<BR>
以下是介紹:<BR>
結構使用MODEL、DAO、SERVICE、UI

<details>
  <summary>Click to view file structure</summary>
  
  <pre>
Project Explorer
└─ **OfficeReportAkademiProgress**
   ├─ src/main/java
   │  ├─ **controller**
   │  │  ├─ Admin.java
   │  │  ├─ ConsumerUI.java
   │  │  ├─ EmployeeUI.java
   │  │  ├─ ShopUI.java
   │  │  └─ MainUI.java
   │  ├─ **dao**
   │  │  └─ **impl**
   │  │     ├─ ConsumerDaoImpl.java
   │  │     ├─ EmployeeDaoImpl.java
   │  │     ├─ OrderDaoImpl.java
   │  │     └─ ProductDaoImpl.java
   │  ├─ **model**
   │  │  ├─ Consumer.java
   │  │  ├─ Employee.java
   │  │  ├─ OrderItem.java
   │  │  ├─ Order.java
   │  │  ├─ Product.java
   │  │  └─ Service
   │  │     └─ **impl**
   │  │        ├─ ConsumerServiceImpl.java
   │  │        ├─ EmployeeServiceImpl.java
   │  │        ├─ OrderServiceImpl.java
   │  │        └─ ProductServiceImpl.java
   │  ├─ **tool**
   │  │  ├─ DbConnection.java
   │  │  └─ Tool.java
   │  └─ src/main/resources
   │     ├─ db.sql
   │     ├─ socket.resources
   │     ├─ socket.java
   │     └─ System Library [java-SE-1.8]
   └─ Maven Dependencies
  </pre>
</details>
//======================================================================

舉例:<BR>




作業說明
這個專案是關於桌面應用程式的使用者註冊功能。它主要實現了以下邏輯：

當使用者輸入資料並點擊「註冊」按鈕後，程式會從介面獲取資料，接著呼叫後端服務來檢查資料庫，確認使用者名稱是否已被註冊。如果帳號不存在，就會將資料存入資料庫；如果帳號已存在，則會跳出錯誤訊息。

這個程式結構遵循了常見的 MVC (Model-View-Controller) 設計模式，將程式碼分成不同的層級來管理：

View (UI)：使用者介面，處理使用者操作。

Service (服務層)：處理業務邏輯，例如檢查帳號是否重複。

DAO (資料庫操作層)：負責與資料庫進行互動，執行新增和查詢。

程式碼區塊

<BR>
<BR>
<BR>


1. 註冊按鈕 (UI 層)
這段程式碼處理使用者點擊「註冊」按鈕的事件，從介面取得所有輸入資料，並呼叫後端服務。

# 註冊使用者系統說明

本作業展示了一個典型的 **三層架構 (UI → Service → DAO/Database)** 的使用者註冊系統，包含 **介面層、服務層、資料庫操作層**。主要功能是註冊使用者並檢查帳號是否重複。

---

## 1️⃣ UI 層 (介面層)

- **功能**：處理使用者操作，收集表單資料，呼叫服務層新增使用者。
- **程式碼**：

```java
JButton btnNewButton = new JButton("註冊");
btnNewButton.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {
        String Name = name.getText();
        String UserName = username.getText();
        String Password = password.getText();
        String Address = address.getText();
        String Phone = phone.getText();
        String Email = email.getText();
        String Nationality = nationality.getText();
        String Gender = gender.getText();
        String BloodType = bloodType.getText();
        String ZodiacSign = zodiacSign.getText();
        String Job = job.getText();
        Integer Age = Integer.parseInt(age.getText());
        Integer Height = Integer.parseInt(height.getText());
        Integer Weight = Integer.parseInt(weight.getText());
        
        Consumer consumer = new Consumer(
            Name, UserName, Password, Address, Phone, Email,
            Nationality, Gender, BloodType, ZodiacSign, Job,
            Age, Height, Weight, "", false, false
        );
        
        // 呼叫服務層檢查並新增使用者
        if (new ConsumerServiceImpl().addConsumer(consumer)) {
            AddSuccess addConsumerSuccess = new AddSuccess();
            addConsumerSuccess.setVisible(true);
            dispose();
        } else {
            errorMessage.setText("帳號已經被註冊了");
        }
    }
});
btnNewButton.setBounds(553, 336, 149, 85);
contentPane.add(btnNewButton);


<BR>
<BR>
<BR>
2. 服務層 (Service)
這段程式碼是業務邏輯的核心，負責在新增使用者前檢查帳號是否重複。
<BR>
//==================================================================
@Override
public boolean addConsumer(Consumer consumer) {
    boolean isUsernameBeenUse = false;
    
    // 呼叫 DAO 層的 read 方法，查詢帳號是否已存在
    Consumer c = consumerDaoImpl.read(consumer.getUsername());
    
    // 如果帳號不存在 (c == null)，則執行新增
    if (c == null) {
        consumerDaoImpl.add(consumer);
        isUsernameBeenUse = true;
    }
    
    return isUsernameBeenUse;
}
//==================================================================
//==================================================================
@Override
public boolean addConsumer(Consumer consumer) {
    boolean isUsernameBeenUse = false;
    
    // 呼叫 DAO 層的 read 方法，查詢帳號是否已存在
    Consumer c = consumerDaoImpl.read(consumer.getUsername());
    
    // 如果帳號不存在 (c == null)，則執行新增
    if (c == null) {
        consumerDaoImpl.add(consumer);
        isUsernameBeenUse = true;
    }
    
    return isUsernameBeenUse;
}
//==================================================================

<BR>

3. 資料庫操作層 (DAO)
這兩段程式碼直接與資料庫互動，執行新增 (add) 和讀取 (read) 操作。
<BR>
<BR>
<BR>
//============================================================
@Override
public void add(Consumer consumer) {
    String sql = "insert into consumer(name,username,password,address,phone,email,nationality,gender,"
               + "bloodType,zodiacSign,job,age,height,weight)"
               + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    
    try {
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, consumer.getName());
        preparedStatement.setString(2, consumer.getUsername());
        preparedStatement.setString(3, consumer.getPassword());
        preparedStatement.setString(4, consumer.getAddress());
        preparedStatement.setString(5, consumer.getPhone());
        preparedStatement.setString(6, consumer.getEmail());
        preparedStatement.setString(7, consumer.getNationality());
        preparedStatement.setString(8, consumer.getGender());
        preparedStatement.setString(9, consumer.getBloodType());
        preparedStatement.setString(10, consumer.getZodiacSign());
        preparedStatement.setString(11, consumer.getJob());
        preparedStatement.setInt(12, consumer.getAge());
        preparedStatement.setInt(13, consumer.getHeight());
        preparedStatement.setInt(14, consumer.getWeight());
        
        preparedStatement.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
//============================================================
//============================================================
//============================================================
@Override
public Consumer read(String username) {
    Consumer consumer = null;
    String sql = "select * from consumer where username=?";
    
    try {
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, username);
        ResultSet resultSet = preparedStatement.executeQuery();
        
        if (resultSet.next()) {
            consumer = new Consumer();
            consumer.setConsumerId(resultSet.getInt("consumerid"));
            consumer.setName(resultSet.getString("name"));
            consumer.setUsername(resultSet.getString("username"));
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    
    return consumer;
}
//============================================================
