package Dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Marks {
	@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
int id;
@Column(unique = true)
int Roll_no;
public int getRoll_no() {
	return Roll_no;
}
public void setRoll_no(int roll_no) {
	Roll_no = roll_no;
}
String standard;
double kannada;
double maths;
double Science;
double percentage;
String result;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getStandard() {
	return standard;
}
public void setStandard(String d) {
	this.standard = d;
}
public double getKannada() {
	return kannada;
}
public double setKannada(double kannada) {
	return this.kannada = kannada;
}
public double getMaths() {
	return maths;
}
public double setMaths(double maths) {
	return this.maths = maths;
}
public double getScience() {
	return Science;
}
public double setScience(double science) {
	return Science = science;
}
public double getPercentage() {
	return percentage;
}
public void setPercentage(double percentage) {
	this.percentage = percentage;
}
public String getResult() {
	return result;
}
public void setResult(String result) {
	this.result = result;
}
}