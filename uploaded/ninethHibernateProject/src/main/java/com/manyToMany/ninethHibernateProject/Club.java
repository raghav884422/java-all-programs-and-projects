package com.manyToMany.ninethHibernateProject;

import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
@Entity
@Table
public class Club {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
int id;
	@Column
String club_name;
	@ManyToMany(mappedBy = "club")
Set<Student> student;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClub_name() {
		return club_name;
	}
	public void setClub_name(String club_name) {
		this.club_name = club_name;
	}
	public Set<Student> getStudent() {
		return student;
	}
	public void setStudent(Set<Student> student) {
		this.student = student;
	}
	public Club(int id, String club_name, Set<Student> student) {
		super();
		this.id = id;
		this.club_name = club_name;
		this.student = student;
	}
	
	public Club(String club_name) {
		super();
		this.club_name = club_name;
	}
	public Club() {
		super();
	}
	@Override
	public int hashCode() {
		return Objects.hash(club_name, id, student);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Club other = (Club) obj;
		return Objects.equals(club_name, other.club_name) && id == other.id && Objects.equals(student, other.student);
	}
	@Override
	public String toString() {
		return "Club [id=" + id + ", club_name=" + club_name + ", student=" + student + "]";
	}
	
}
