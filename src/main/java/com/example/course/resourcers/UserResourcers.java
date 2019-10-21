package com.example.course.resourcers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.entities.User;

@RestController  //anotations
@RequestMapping(value = "/users")
public class UserResourcers {

	@GetMapping
	public ResponseEntity<User> findAll() {
		
		User user = new User(1L, "Amanda", "amanda@gmail", "88-99995-9218", "spring");
		return ResponseEntity.ok().body(user);
	}
	
}
