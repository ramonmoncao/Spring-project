package com.ramonmoncao.courseProject.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ramonmoncao.courseProject.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Ramon", "ramon@hotmail.com", "1999999", "ramon123");
		return ResponseEntity.ok().body(u);
	}
}
