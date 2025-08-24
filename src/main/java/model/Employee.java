package model;

import java.sql.Timestamp;

public class Employee 
{
private int employeeId; // 員工ID，資料庫主鍵
private String employeeName;//員工名稱
private String username; //員工帳號	
private String password; //員工密碼
private String address; //地址
private String phone; //電話
private String email; //信箱
private String nationality;//國籍
private String gender; //性別
private String bloodType; //血型
private String zodiacSign; //星座
private String education; //學歷
private String certifications; //證照
private String portfolio; //作品
private String experience; // 經歷
//~~~~~~~~~~
private String discProfile; //DISC 性格測驗結果
private String workValues; //SUPEN 工作價值觀
private String position;   // 職位
private String benefits;// 福利
private String assessment;//考核
private String violationRecord;//違規紀錄
private Integer paidLeave; // 有薪假
private Integer salary;// 薪水
private Integer pension;//退休金
private Timestamp employeeRegisterTime; // 員工註冊時間
private Timestamp employeeLoginTime; // 員工登入時間
//===================================================
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
//===================================================
public Employee(String employeeName, String username, String password, String address, String phone, String email,
		String nationality, String gender, String bloodType, String zodiacSign, String education, String certifications,
		String portfolio, String experience, String discProfile, String workValues, String position, String benefits,
		String assessment, String violationRecord, Integer paidLeave, Integer salary, Integer pension) {
	super();
	this.employeeName = employeeName;
	this.username = username;
	this.password = password;
	this.address = address;
	this.phone = phone;
	this.email = email;
	this.nationality = nationality;
	this.gender = gender;
	this.bloodType = bloodType;
	this.zodiacSign = zodiacSign;
	this.education = education;
	this.certifications = certifications;
	this.portfolio = portfolio;
	this.experience = experience;
	this.discProfile = discProfile;
	this.workValues = workValues;
	this.position = position;
	this.benefits = benefits;
	this.assessment = assessment;
	this.violationRecord = violationRecord;
	this.paidLeave = paidLeave;
	this.salary = salary;
	this.pension = pension;
}
//===================================================
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
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
public String getEducation() {
	return education;
}
public void setEducation(String education) {
	this.education = education;
}
public String getCertifications() {
	return certifications;
}
public void setCertifications(String certifications) {
	this.certifications = certifications;
}
public String getPortfolio() {
	return portfolio;
}
public void setPortfolio(String portfolio) {
	this.portfolio = portfolio;
}
public String getExperience() {
	return experience;
}
public void setExperience(String experience) {
	this.experience = experience;
}
public String getDiscProfile() {
	return discProfile;
}
public void setDiscProfile(String discProfile) {
	this.discProfile = discProfile;
}
public String getWorkValues() {
	return workValues;
}
public void setWorkValues(String workValues) {
	this.workValues = workValues;
}
public String getPosition() {
	return position;
}
public void setPosition(String position) {
	this.position = position;
}
public String getBenefits() {
	return benefits;
}
public void setBenefits(String benefits) {
	this.benefits = benefits;
}
public String getAssessment() {
	return assessment;
}
public void setAssessment(String assessment) {
	this.assessment = assessment;
}
public String getViolationRecord() {
	return violationRecord;
}
public void setViolationRecord(String violationRecord) {
	this.violationRecord = violationRecord;
}
public Integer getPaidLeave() {
	return paidLeave;
}
public void setPaidLeave(Integer paidLeave) {
	this.paidLeave = paidLeave;
}
public Integer getSalary() {
	return salary;
}
public void setSalary(Integer salary) {
	this.salary = salary;
}
public Integer getPension() {
	return pension;
}
public void setPension(Integer pension) {
	this.pension = pension;
}
public Timestamp getEmployeeRegisterTime() {
	return employeeRegisterTime;
}
public void setEmployeeRegisterTime(Timestamp employeeRegisterTime) {
	this.employeeRegisterTime = employeeRegisterTime;
}
public Timestamp getEmployeeLoginTime() {
	return employeeLoginTime;
}
public void setEmployeeLoginTime(Timestamp employeeLoginTime) {
	this.employeeLoginTime = employeeLoginTime;
}

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~用來下拉員工清單
public String toString() {
    return this.employeeName; 
}
//===================================================











}
