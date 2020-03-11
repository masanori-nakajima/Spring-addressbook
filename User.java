package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "addressbook")
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long Id;
	
    @Column
    private long user_Id;
    
    @Column
    private String Name;
    
    @Column
    private String address;
}
