package com.capgemini.springbootapp.dao;

import com.capgemini.springbootapp.dto.UserInfo;

public interface UserDao {
public boolean createProfile(UserInfo user) ;
public boolean updatePassword(int id,String password);
public UserInfo login(String email,String password);
}
