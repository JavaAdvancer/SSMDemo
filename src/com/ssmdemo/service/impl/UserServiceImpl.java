package com.ssmdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssmdemo.entity.User;
import com.ssmdemo.mapper.UserMapper;
import com.ssmdemo.service.UserService;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		List<User> listUser = userMapper.findAllUser();
		return listUser;
	}

	@Override
	public Integer insertUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.insertUser(user);
	}

	@Override
	public User findByUserId(Integer id) {
		// TODO Auto-generated method stub
		User user = userMapper.findByUserId(id);
		return user;
	}

	@Override
	public Integer deleteUserById(Integer id) {
		// TODO Auto-generated method stub
		Integer flag = userMapper.deleteUserById(id);
		return flag;
	}

}
