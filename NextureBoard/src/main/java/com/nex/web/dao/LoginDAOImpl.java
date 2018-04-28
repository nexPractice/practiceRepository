package com.nex.web.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.nex.web.vo.UserVO;

@Repository
public class LoginDAOImpl implements LoginDAO {

	@Inject
	private SqlSession session;

	@Override
	public String login(UserVO vo) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
