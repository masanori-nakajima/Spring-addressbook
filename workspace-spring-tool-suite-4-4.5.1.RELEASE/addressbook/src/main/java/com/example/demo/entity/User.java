package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
<<<<<<< HEAD
import java.io.Serializable;
=======
>>>>>>> 587e63831e7770ee7e9eae4471bbe18593171770
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

<<<<<<< HEAD
import lombok.Data;

@Entity
@Data
@Table(name = "addressbook")
public class User implements Serializable {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
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

=======
@Entity
@Table(name = "addressbook")
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int Id;
	
    @Column
    private String user_Id;
    
    @Column
    private String Name;
    
    @Column
    private String address;
}
>>>>>>> 587e63831e7770ee7e9eae4471bbe18593171770
