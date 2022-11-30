package com.company.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.company.dao.UserDAO;
import com.company.service.UserService;
import com.company.vo.UserVO;

@Repository
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userDAO;

	@Override
	public UserVO getInfo() {
		return userDAO.getInfo();
	}
	
	@Override
	public UserVO getUserOne(String common, String col) {
		return userDAO.getUserOne(common,col);
	}

	@Override
	public void insert(UserVO vo) {
		userDAO.insert(vo);
		
	}

	@Override
	public UserVO read(String userid) {
		return userDAO.read(userid);
	}

	@Override
	public int idCheck(String userid) {
		return userDAO.idCheck(userid);
	}



	

}
