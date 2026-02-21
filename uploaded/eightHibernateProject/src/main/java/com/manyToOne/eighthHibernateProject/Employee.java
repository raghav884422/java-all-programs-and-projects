package com.manyToOne.eighthHibernateProject;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
int eid;
	@Column
String ename;
	@Column
int esalary;
	@ManyToOne
	@JoinColumn(name = "did",referencedColumnName = "id")
Department department;
	
	public Employee(int eid, String ename, int esalary, Department department) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		this.department = department;
	}
	public Employee() {
		super();
	}
	public Employee(String ename, int esalary, Department department) {
		super();
		this.ename = ename;
		this.esalary = esalary;
		this.department = department;
	}
	public Employee(String ename, int esalary) {
		super();
		this.ename = ename;
		this.esalary = esalary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", department=" + department
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(department, eid, ename, esalary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(department, other.department) && eid == other.eid && Objects.equals(ename, other.ename)
				&& esalary == other.esalary;
	}
	
	
}
