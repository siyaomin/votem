package com.lou19.votem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lou19.votem.dao.UserDao;
import com.lou19.votem.model.User;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
private UserDao userDao;
	public User single(String id) {
		return userDao.single(id);
	}

}
