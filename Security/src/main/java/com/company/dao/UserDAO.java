package com.company.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.company.vo.UserVO;

@Repository("UserDAO")
public class UserDAO {

	
	@Autowired
	private SqlSession sqlSession;
	
	public UserVO getInfo() {
		return sqlSession.selectOne("UserMapper.getInfo");
	}
	
	public UserVO getUserOne(String common, String col) {
		HashMap<String, Object> map = new HashMap<String,Object>();
		if(col.equals("userId")) {
			map.put("userId", common);
		}else if(col.equals("nickname")) {
			map.put("nickname", common);
		}
		
		return sqlSession.selectOne("UserMapper.getUserOne",map);
	}
	
	public void insert(UserVO vo) {
		sqlSession.insert("UserMapper.insert",vo);
	}
	
	public UserVO read(String userid) {
		return sqlSession.selectOne("UserMapper.read",userid);
	}
	
	public int idCheck(String userid) {
		UserVO vo = sqlSession.selectOne("UserMapper.idCheck", userid);
		
		if(vo != null) {
			return 1;
		}else {
			return 0;
		}
	}
}
