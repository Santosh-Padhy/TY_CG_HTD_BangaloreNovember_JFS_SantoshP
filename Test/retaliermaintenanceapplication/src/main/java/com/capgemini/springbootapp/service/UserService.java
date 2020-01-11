package com.capgemini.springbootapp.service;

import com.capgemini.springbootapp.dto.UserInfo;

public interface UserService {
	public boolean createProfile(UserInfo user) ;
	public boolean updatePassword(int id,String password);
	public UserInfo login(String email,String password);
}
