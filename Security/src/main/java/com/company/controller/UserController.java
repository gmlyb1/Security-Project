package com.company.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.company.service.UserService;
import com.company.vo.UserVO;

@Controller
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/user/login.do")
	public String login() {
		return "/user/login";
	}
	
	@RequestMapping(value="/user/loginPage")
	public String loginPage() {
		return "/user/loginPage";
	}
	
	@RequestMapping(value="/user/accessDenied.do")
	public String accessDeniedPage() throws Exception {
		return "/user/accessDenied";
	}
	
	@RequestMapping(value="/user/signUp", method=RequestMethod.GET)
	public void signUpGET() {
		
	}
	
	@RequestMapping(value="/user/signUp", method=RequestMethod.POST)
	public String signUp(UserVO vo) {
		
		userService.insert(vo);
		
		return "redirect:/user/signUp" + vo.getUserId();
	}
	
	@RequestMapping(value = "/user/read/{userid}",method= RequestMethod.GET )
		public String read(@PathVariable("userid") String userid, Model model) {
		UserVO vo = userService.read(userid);
		model.addAttribute("userInfo", vo);
		return "/user/read";
	}

	@ResponseBody
	@RequestMapping(value = "/user/idCheck", method=RequestMethod.POST)
	public int idCheck(UserVO vo) {
		String userid = vo.getUserId();
		int result = userService.idCheck(userid);
		
		return result;
	}
}
