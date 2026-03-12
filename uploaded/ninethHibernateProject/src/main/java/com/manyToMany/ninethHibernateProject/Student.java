package com.manyToMany.ninethHibernateProject;

import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

import jakarta.persistence.Table;
@Entity
@Table
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
int id;
	@Column
String name;
	@Column
String email;
	@ManyToMany
	@JoinTable( name = "student_club",
	     joinColumns =  @JoinColumn(name="student_id"),
	     inverseJoinColumns = @JoinColumn(name = "club_id") 
			)
Set <Club> club;
public Student(int id, String name, String email, Set<Club> club) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.club = club;
}
public Student(String name, String email) {
	super();
	this.name = name;
	this.email = email;
}
public Student(String name, String email, Set<Club> club) {
	super();
	this.name = name;
	this.email = email;
	this.club = club;
}
public Student() {
	super();
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
public Set<Club> getClub() {
	return club;
}
public void setClub(Set<Club> club) {
	this.club = club;
}
@Override
public int hashCode() {
	return Objects.hash(club, email, id, name);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	return Objects.equals(club, other.club) && Objects.equals(email, other.email) && id == other.id
			&& Objects.equals(name, other.name);
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", email=" + email + ", club=" + club + "]";
}

}
