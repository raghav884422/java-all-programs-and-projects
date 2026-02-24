package com.oneToOne.fifthHobernateProject;

import java.util.Objects;

import javax.annotation.processing.Generated;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table
public class address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
int id;
	@Column
String street;
	@Column
String city;
	@Column
String state;
	@Column
int zipcode;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getZipcode() {
	return zipcode;
}
public void setZipcode(int zipcode) {
	this.zipcode = zipcode;
}
@Override
public String toString() {
	return "address [id=" + id + ", street=" + street + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode
			+ "]";
}
public address(String street, String city, String state, int zipcode) {
	super();
	this.street = street;
	this.city = city;
	this.state = state;
	this.zipcode = zipcode;
}
public address(int id, String street, String city, String state, int zipcode) {
	super();
	this.id = id;
	this.street = street;
	this.city = city;
	this.state = state;
	this.zipcode = zipcode;
}
public address() {
	super();
}
@Override
public int hashCode() {
	return Objects.hash(city, id, state, street, zipcode);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	address other = (address) obj;
	return Objects.equals(city, other.city) && id == other.id && Objects.equals(state, other.state)
			&& Objects.equals(street, other.street) && zipcode == other.zipcode;
}
}
