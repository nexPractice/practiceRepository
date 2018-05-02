package com.nex.web.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nex.web.service.LoginService;
import com.nex.web.vo.UserVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Inject
	LoginService service;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public void login(String id,String pwd, Model model) throws Exception{
		UserVO result = service.login(new UserVO(id, pwd));
		if(result != null) {
			System.out.println(result.toString());
		}
		else {
			System.out.println("데이터 수신 실패");
		}
	}
	
	
}
