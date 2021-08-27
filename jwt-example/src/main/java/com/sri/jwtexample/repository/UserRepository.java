package com.sri.jwtexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sri.jwtexample.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUserName(String username);

}
