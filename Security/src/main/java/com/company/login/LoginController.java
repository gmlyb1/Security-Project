package com.company.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.service.LoginService;

@Controller
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="/login/loginPage.do")
	public String loginPage() {
		return "/login/loginPage";
	}
	
	
	@RequestMapping(value="/login/accessDenied.do")
	public String accessDeniedPage() throws Exception {
		return "/login/accessDenied";
	}
	
}
