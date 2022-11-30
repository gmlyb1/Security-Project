package com.company.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.company.vo.LoginVO;

@Repository("LoginDAO")
public class LoginDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	public LoginVO getInfo() {
		return sqlSession.selectOne("login.getInfo");
	}
}
