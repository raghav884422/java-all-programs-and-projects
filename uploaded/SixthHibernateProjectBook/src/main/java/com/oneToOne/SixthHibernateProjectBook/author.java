package com.oneToOne.SixthHibernateProjectBook;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table; 
@Entity
@Table
public class author {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
int id;
	@Column
String name;
	@Column
String gender;
	@Column
int age;
	
@Column
String adress;

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

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getAdress() {
	return adress;
}

public void setAdress(String adress) {
	this.adress = adress;
}

public author(int id, String name, String gender, int age, String adress) {
	super();
	this.id = id;
	this.name = name;
	this.gender = gender;
	this.age = age;
	this.adress = adress;
}

public author(String name, String gender, int age, String adress) {
	super();
	this.name = name;
	this.gender = gender;
	this.age = age;
	this.adress = adress;
}

@Override
public String toString() {
	return "author [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", adress=" + adress + "]";
}


}
