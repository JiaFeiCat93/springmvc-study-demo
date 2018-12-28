package com.qetch.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qetch.spring.entity.User;
import com.qetch.spring.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="hello")
	public String hello() {
		return "index2";
	}
	
	@ResponseBody
	@RequestMapping(value="/user/get/{id}", method=RequestMethod.GET)
	public User get(@PathVariable("id") Integer id) {
		return userService.get(id);
	}
	
	@ResponseBody
	@RequestMapping(value="/user/list", method=RequestMethod.GET)
	public List<User> list() {
		return userService.list();
	}
	
	@ResponseBody
	@RequestMapping(value="/user/update", method=RequestMethod.POST)
	public void update(User user) {
		userService.update(user);
	}
	
	@ResponseBody
	@RequestMapping(value="/user/delete/{id}", method=RequestMethod.GET)
	public void delete(@PathVariable("id") Integer id) {
		userService.delete(id);
	}
}
