package com.example.demo.Repository;

import com.example.demo.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
		public User findById(int Id);
		public User findByName(String Name);
		
}