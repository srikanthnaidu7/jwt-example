package com.sri.jwtexample;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sri.jwtexample.entity.User;
import com.sri.jwtexample.repository.UserRepository;

@SpringBootApplication
public class JwtExampleApplication {
	@Autowired
	private UserRepository repository;
	
	@PostConstruct
	public void initUser() {
		
		List<User> users = Stream.of(
					new User(1,"user1","user1","user1@gmail.com"),
					new User(2,"user2","user2","user2@gmail.com"),
					new User(3,"user3","user3","user3@gmail.com"),
					new User(4,"user4","user4","user4@gmail.com")
				).collect(Collectors.toList());
		
		repository.saveAll(users);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(JwtExampleApplication.class, args);
	}

}
