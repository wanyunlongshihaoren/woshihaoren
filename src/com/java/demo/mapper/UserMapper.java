package com.java.demo.mapper;

import com.java.demo.domain.User;

public interface UserMapper {
	User findUserByID(int id);
	void updateUser(int id , int money);
}
