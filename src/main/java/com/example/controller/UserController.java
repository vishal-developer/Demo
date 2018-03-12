package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;

@RestController
@RequestMapping(value = "/user")
public class UserController extends com.example.controller.RestController{
	
	
	@RequestMapping(value = "/getAllUser", method = RequestMethod.GET)
	public List<User> getAll(){
		return userService.getAllUsers();
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public User saveUser(@RequestBody User user){
		return userService.saveUser(user);
	}

}
