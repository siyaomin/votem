package com.lou19.votem.dao;

import org.springframework.stereotype.Repository;

import com.lou19.votem.model.User;
@Repository
public interface UserDao {
	public abstract User single(String id);
}

