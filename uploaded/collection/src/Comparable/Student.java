package Comparable;

import java.util.Comparator;

public class Student implements Comparable{
	private int id;
	private String name;
	private int marks;
	private int sem;

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

	public int getSem() {
		return sem;
	}

	public void setSem(int sem) {
		this.sem = sem;
	}

	public Student(int id, String name, int marks, int sem) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.sem = sem;
	}



	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(this.marks>((Student)o).marks) {
		return 1;
		}
		if(this.marks<((Student)o).marks) {
			return -1;
			}
		else {
			return 0;
	}
	}
	public String toString() {
		return name+" "+id+" "+marks+" "+sem;
	}

	
	
}
