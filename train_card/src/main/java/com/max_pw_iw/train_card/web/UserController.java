package com.max_pw_iw.train_card.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.max_pw_iw.train_card.entity.User;
import com.max_pw_iw.train_card.services.UserService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/person")
public class UserController {
    
    private UserService personService;

    @GetMapping("/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User person = personService.getPerson(id);
		return new ResponseEntity<>(person, HttpStatus.OK);
	}

    @GetMapping("/")
	public ResponseEntity<List<User>> findAll() {
		List<User> people = personService.getPeople();
		return new ResponseEntity<>(people, HttpStatus.OK);
	}


}
