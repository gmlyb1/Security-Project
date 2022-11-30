package com.company.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.company.dao.LoginDAO;
import com.company.service.LoginService;
import com.company.vo.LoginVO;

@Repository
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginDAO loginDAO;
	
	@Override
	public LoginVO getInfo() {
		return loginDAO.getInfo();
	}
	
	
}
