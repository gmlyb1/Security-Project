package com.company.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.company.service.UserService;
import com.company.vo.UserVO;

@Controller
@RequestMapping("jquery/*")
public class JqueryController {

	private static final Logger logger = LoggerFactory.getLogger(JqueryController.class);
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/jquery/logout")
	public String logout(HttpSession session) {
		
		session.removeAttribute("loginUser");
		
		session.invalidate();
		return "/user/loginPage";
	}
	
	@RequestMapping(value="/jquery/signUp", method= RequestMethod.POST)
	@ResponseBody
	public int signUp(UserVO vo) {
		int result = 0;
		String col = null;
		
		col = "userId";
		UserVO userIdCheck = userService.getUserOne(vo.getUserId(),col);
		if(userIdCheck != null) {
			result = 2;
		}
		
//		col = "nickname";
//		UserVO userNickNameCheck = userService.getUserOne(vo.getNickName(),col);
//		if(userNickNameCheck != null) {
//			result = 3;
//		}
		
//		if(result < 2 ) {
//			result = userService.insert(vo);
//		}
		
		return result;
		
	}
	
//	@RequestMapping(value="/jquery/loginPage" , method=RequestMethod.POST) 
//	@ResponseBody
//	public int login(UserVO vo, HttpSession session) {
//		int result = 0;
//		String col = null;
//		col = "userId";
//		UserVO userIdCheck = userService.getUserOne(vo.getUserId(), col);
//		
//		if(userIdCheck == null) {
//			result = 2;
//		}else {
//			if(userIdCheck.getUserId().equals(userIdCheck.getUserId())) {
//				if(userIdCheck.getPassword().equals(userIdCheck.getPassword())) {
//					session.setAttribute("loginUser", userIdCheck);
//					result = 3;
//				}else {
//					result = 2;
//				}
//				
//			}else {
//				result = 2;
//			}
//		}
//		
//		return result;
//	}
}