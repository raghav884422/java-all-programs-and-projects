package com.oneTomany.seventhhibernateProject;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name = "kodneststudent")
public class KodnestStudent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
int id ;
	@Column

String name;
	@Column

String email;
	@Column

int phone;
	
	@OneToMany(mappedBy = "ks")
List<Course> courses;

public KodnestStudent(int id, String name, String email, int phone, List<Course> courses) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.phone = phone;
	this.courses = courses;
}
public KodnestStudent() {
	// TODO Auto-generated constructor stub
}
public KodnestStudent(String name, String email, int phone, List<Course> courses) {
	super();
	this.name = name;
	this.email = email;
	this.phone = phone;
	this.courses = courses;
}
public KodnestStudent(String name, String email, int phone) {
	super();
	this.name = name;
	this.email = email;
	this.phone = phone;
}
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getPhone() {
	return phone;
}
public void setPhone(int phone) {
	this.phone = phone;
}
public List<Course> getCourses() {
	return courses;
}
public void setCourses(List<Course> courses) {
	this.courses = courses;
}
@Override
public String toString() {
	return "KodnestStudent [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", courses="
			+ courses + "]";
}
@Override
public int hashCode() {
	return Objects.hash(courses, email, id, name, phone);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	KodnestStudent other = (KodnestStudent) obj;
	return Objects.equals(courses, other.courses) && Objects.equals(email, other.email) && id == other.id
			&& Objects.equals(name, other.name) && phone == other.phone;
}

}
