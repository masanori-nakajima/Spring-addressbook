package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
@Table(name = "addressbook")
public class User implements Serializable {
	@Id
    @GeneratedValue
    @Column(name= "Id")
    private int Id;
    
    @Column(name= "Name")
    private String Name;
    
    @Column(name= "Address")
    private String Address;

	public long getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
}

