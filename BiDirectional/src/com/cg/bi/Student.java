package com.cg.bi;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;


@Entity
@Table(name="student")
public class Student implements Serializable {
	
private static final long serialVersionUID=1L;

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String name;

@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="address_id")
private Address address;

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
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}
}
