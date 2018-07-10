package com.chenzeshenga.springboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chenzeshenga.springboot.model.User;

@RestController
public class RESTFullController {

	@RequestMapping("/boot/user/{id}")
	public Object user(@PathVariable("id") Integer id) {
		User user = new User();
		user.setId(id.toString());
		return user;
	}
}
