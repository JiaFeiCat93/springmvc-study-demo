package com.qetch.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qetch.spring.dao.UserDao;
import com.qetch.spring.entity.User;
import com.qetch.spring.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public User get(Integer id) {
		return userDao.getUserById(id);
	}

	@Override
	public List<User> list() {
		return userDao.getAllUsers();
	}

	@Override
	public Integer save(User user) {
		return userDao.saveUser(user);
	}

	@Override
	public void update(User user) {
		userDao.updateUser(user);
	}

	@Override
	public void delete(Integer id) {
		userDao.deleteUser(id);
	}

}
