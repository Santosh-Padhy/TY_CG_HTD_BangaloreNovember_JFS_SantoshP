package com.capgemini.springbootapp.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.springbootapp.dao.UserDao;
import com.capgemini.springbootapp.dto.UserInfo;

public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserDao userdao;
	
	@Override
	public boolean createProfile(UserInfo user) {
		// TODO Auto-generated method stub
		return userdao.createProfile(user);
	}

	@Override
	public boolean updatePassword(int id, String password) {
		// TODO Auto-generated method stub
		return userdao.updatePassword(id, password);
	}

	@Override
	public UserInfo login(String email, String password) {
		// TODO Auto-generated method stub
		return userdao.login(email, password);
	}

}
