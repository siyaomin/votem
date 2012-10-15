package com.lou19.votem.dao;

import org.springframework.stereotype.Repository;

import com.lou19.votem.model.User;
@Repository
public class UserDaoImpl implements UserDao{

	public User single(String id) {
		User u=new User(id);
		return u;
	}

}
