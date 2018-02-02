package com.ssmdemo.service;

import java.util.List;

import com.ssmdemo.entity.User;

public interface UserService {

	List<User> findAllUser();
	
	Integer insertUser(User user);
	
	User findByUserId(Integer id);
	
	Integer deleteUserById(Integer id);
}
