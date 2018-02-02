package com.ssmdemo.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ssmdemo.entity.User;

@Repository
public interface UserMapper {

	List<User> findAllUser();
	
	Integer insertUser(User user);
	
	User findByUserId(Integer id);
	
	Integer deleteUserById(Integer id);
}
