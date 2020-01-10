package com.capgemini.fms.dao;

import java.util.List;

import com.capgemini.fms.bean.Admin;

public interface AdminDao {
public List<Admin> login(String username ,String password);
public boolean addlogindetails(String username,String password);
}
