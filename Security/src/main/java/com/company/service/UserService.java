package com.company.service;

import java.util.List;

import com.company.vo.UserVO;

public interface UserService {

	public UserVO getInfo();
	
	public UserVO getUserOne(String common, String col);
	
	public void insert(UserVO vo);
	
	public UserVO read(String userid);
	
	public int idCheck(String userid);
}
