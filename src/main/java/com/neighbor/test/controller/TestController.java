package com.neighbor.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neighbor.sample.Chef;
import com.neighbor.test.service.UserService;
import com.neighbor.test.vo.User;

@RestController
@RequestMapping("/test")
public class TestController {

	@Autowired
	UserService userService;

	@GetMapping("/chef")
	public Chef goTestPage() {
		Chef chef = new Chef();
		chef.setId(0);
		chef.setName("Chef1");
		return chef;
	}

	@GetMapping("/user")
	public List<User> getUserList() {
		List<User> user = userService.getUserList();
		return user;
	}
}