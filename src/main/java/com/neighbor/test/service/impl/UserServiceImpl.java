package com.neighbor.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.neighbor.test.dao.UserDAO;
import com.neighbor.test.service.UserService;
import com.neighbor.test.vo.User;

@Repository
public class UserServiceImpl implements UserService {
      
	  @Autowired
	  UserDAO userDao;

	@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return userDao.getUserList();
	}
}