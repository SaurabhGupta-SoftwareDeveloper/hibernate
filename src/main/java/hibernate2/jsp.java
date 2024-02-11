package hibernate2;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
@Entity
public class jsp {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private double salary;
private String subname;
private int age;
@Lob
private byte[] image;
@CreationTimestamp
private Date time;
@UpdateTimestamp
private Date updatedTime;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getSubname() {
	return subname;
}
public void setSubname(String subname) {
	this.subname = subname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public byte[] getImage() {
	return image;
}
public void setImage(byte[] image) {
	this.image = image;
}
public Date getTime() {
	return time;
}
public void setTime(Date time) {
	this.time = time;
}
public Date getUpdatedTime() {
	return updatedTime;
}
public void setUpdatedTime(Date updatedTime) {
	this.updatedTime = updatedTime;
}

}
