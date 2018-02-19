package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.User;
import com.example.service.UserService;


@RequestMapping(value = "/rest")
@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String loadGoogle(){
				return "test";
		
	}
	
	
	@RequestMapping(value = "/getAllUser", method = RequestMethod.GET)
	public List<User> getAll(){
		return userService.getAllUsers();
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public User saveUser(@RequestBody User user){
		return userService.saveUser(user);
	}
	
	
	

}
