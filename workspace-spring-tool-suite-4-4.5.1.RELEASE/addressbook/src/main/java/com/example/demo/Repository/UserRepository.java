package com.example.demo.Repository;

<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	
=======
import com.example.demo.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
		public User findById(int Id);
		public User findByName(String Name);
		
>>>>>>> 587e63831e7770ee7e9eae4471bbe18593171770
}