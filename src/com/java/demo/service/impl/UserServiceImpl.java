package com.java.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.demo.domain.User;
import com.java.demo.mapper.UserMapper;
import com.java.demo.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	@Override
	public User queryUser(int id) {
		User user = userMapper.findUserByID(id);
		return user;
	}
	@Override
	@Transactional
	public void zhuangzhang() {
		userMapper.updateUser(2, -1000);
		
		userMapper.updateUser(1, 1000);
		
	}

}
