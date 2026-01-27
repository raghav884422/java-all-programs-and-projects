package com.hibernate.FirstProgram1.stHibernateProgram;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
	@Entity
	@Table
	public class student {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		int id;
		@Column
		String name;
	   @Column
		int marks;
		@Column
	   String email;
		public student(int id, String name, int marks, String email) {
			super();
			this.id = id;
			this.name = name;
			this.marks = marks;
			this.email = email;
		}
		public student(String name, int marks, String email) {
			super();
			this.name = name;
			this.marks = marks;
			this.email = email;
		}
		public student() {
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
		public int getMarks() {
			return marks;
		}
		public void setMarks(int marks) {
			this.marks = marks;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		@Override
		public String toString() {
			return "student [id=" + id + ", name=" + name + ", marks=" + marks + ", email=" + email + "]";
		}
		

	}

}
