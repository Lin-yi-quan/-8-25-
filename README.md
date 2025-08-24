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
UI介面new ConsumerServiceImpl().addConsumer(consumer )<BR>
=====><BR>
ConsumerServiceImpl
