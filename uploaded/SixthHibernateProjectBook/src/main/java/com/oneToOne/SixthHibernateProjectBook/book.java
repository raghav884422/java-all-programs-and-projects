package com.oneToOne.SixthHibernateProjectBook;

import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table
public class book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
int id;
	@Column
String name;
	@Column
int price;
	@Column(name="no_Of_pages")
int noOfpages;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="author_id",referencedColumnName = "id")
author address;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNoOfpages() {
		return noOfpages;
	}
	public void setNoOfpages(int noOfpages) {
		this.noOfpages = noOfpages;
	}
	public author getAdress() {
		return address;
	}
	public void setAdress(author adress) {
		this.address = adress;
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, id, name, noOfpages, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		book other = (book) obj;
		return Objects.equals(address, other.address) && id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(noOfpages, other.noOfpages) && price == other.price;
	}
	public book(int id, String name, int price, int noOfpages, author adress) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.noOfpages = noOfpages;
		this.address = adress;
	}
	public book(String name, int price, int noOfpages, author address) {
		super();
		this.name = name;
		this.price = price;
		this.noOfpages = noOfpages;
		this.address = address;
	}
	public book(String name, int price, int noOfpages) {
		super();
		this.name = name;
		this.price = price;
		this.noOfpages = noOfpages;
	}

}
