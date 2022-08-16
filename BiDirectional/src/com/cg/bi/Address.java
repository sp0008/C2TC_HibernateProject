package com.cg.bi;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Column;

@Entity
public class Address implements Serializable{
	
private static final long serialVersionUID=1L;
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int address_id;

@Column(name="address_street")
private String street;
@Column(name="address_city")
private String city;
@Column(name="address_state")
private String State;
@Column(name="address_zipcode")
private String zipcode;

@OneToOne(mappedBy="address")
private Student student;

public int getAddress_id() {
	return address_id;
}
public void setAddress_id(int address_id) {
	this.address_id = address_id;
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
	return State;
}
public void setState(String state) {
	State = state;
}
public String getZipcode() {
	return zipcode;
}
public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}
}

