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
這次作業是關於使用者註冊功能的開發。程式碼實現了以下邏輯：

當使用者在介面輸入資料並點擊註冊按鈕後，程式會先檢查使用者名稱是否已存在。如果不存在，則將新使用者的資料存入資料庫；如果已存在，則顯示錯誤訊息。

程式碼區塊
1. 註冊按鈕 (GUI)
這段程式碼處理使用者在介面上的操作，取得輸入資料，並呼叫後端服務。

Java

//=================================================按鈕
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
            Age, Height, Weight, "", false, false);
        
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
//====================================================按鈕
