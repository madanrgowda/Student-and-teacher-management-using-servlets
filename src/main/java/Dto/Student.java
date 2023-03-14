package Dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student{
	@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
int id;
String Name;
int Roll_no;
public int getRoll_no() {
	return Roll_no;
}
public void setRoll_no(int roll_no) {
	Roll_no = roll_no;
}

@Column(unique = true)
String Email;
String PassWord;
String Standard;
String DOB;
int Age;
String Gender;
@Column(unique = true)
long mobile;
@OneToMany
List<Marks> m;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getPassWord() {
	return PassWord;
}
public void setPassWord(String passWord) {
	PassWord = passWord;
}
public String getStandard() {
	return Standard;
}
public void setStandard(String standard) {
	Standard = standard;
}
public String getDOB() {
	return DOB;
}
public String setDOB(String dOB) {
	return DOB = dOB;
}
public int getAge() {
	return Age;
}
public void setAge(int age) {
	Age = age;
}
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
public List<Marks> getM() {
	return m;
}
public void setM(List<Marks> m) {
	this.m = m;
}

}


