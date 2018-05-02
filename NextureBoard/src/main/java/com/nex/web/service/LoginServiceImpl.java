package com.nex.web.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.nex.web.dao.LoginDAO;
import com.nex.web.vo.UserVO;

@Service
public class LoginServiceImpl implements LoginService {

	@Inject 
	private LoginDAO dao;
	
	@Override
	public UserVO login(UserVO vo) throws Exception{
		// TODO Auto-generated method stub
		return dao.login(vo);
	}
	
	
}
