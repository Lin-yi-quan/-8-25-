package model;

import java.sql.Timestamp;

public class Consumer 
{
	private int consumerId; //會員id資料庫主鍵
	private String name;	//顧客名字
	private String username; //申請帳號	
	private String password; //申請密碼
	private String address; //地址
	private String phone; //電話
	private String email; //信箱
	private String nationality;//國籍
	private String gender; //性別
	private String bloodType; //血型
	private String zodiacSign; //星座
	private String job; //工作
	private Integer age; //年齡
	private Integer height;//身高
	private Integer weight; //體重
	private String violationRecord;//違規紀錄
	private boolean member;//是否會員
	private boolean ban;//是否違規被禁
	private Timestamp consumerRegisterTime; // 註冊時間
	private Timestamp consumerLoginTime; // 登入時間
	//============================================
	public Consumer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//===========================================
	public Consumer(String name, String username, String password, String address, String phone, String email,
			String nationality, String gender, String bloodType, String zodiacSign, String job, Integer age,
			Integer height, Integer weight, String violationRecord, boolean member, boolean ban) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.nationality = nationality;
		this.gender = gender;
		this.bloodType = bloodType;
		this.zodiacSign = zodiacSign;
		this.job = job;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.violationRecord = violationRecord;
		this.member = member;
		this.ban = ban;
	}

	public int getConsumerId() {
		return consumerId;
	}

	public void setConsumerId(int consumerId) {
		this.consumerId = consumerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String getZodiacSign() {
		return zodiacSign;
	}

	public void setZodiacSign(String zodiacSign) {
		this.zodiacSign = zodiacSign;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public String getViolationRecord() {
		return violationRecord;
	}

	public void setViolationRecord(String violationRecord) {
		this.violationRecord = violationRecord;
	}

	public boolean isMember() {
		return member;
	}

	public void setMember(boolean member) {
		this.member = member;
	}

	public boolean isBan() {
		return ban;
	}

	public void setBan(boolean ban) {
		this.ban = ban;
	}

	public Timestamp getConsumerRegisterTime() {
		return consumerRegisterTime;
	}

	public void setConsumerRegisterTime(Timestamp consumerRegisterTime) {
		this.consumerRegisterTime = consumerRegisterTime;
	}

	public Timestamp getConsumerLoginTime() {
		return consumerLoginTime;
	}

	public void setConsumerLoginTime(Timestamp consumerLoginTime) {
		this.consumerLoginTime = consumerLoginTime;
	}
	
	//=============================================
	
	
	
	
	
	
	
	
}