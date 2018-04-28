package com.nex.web.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nex.web.vo.UserVO;

@Repository
public class LoginDAOImpl implements LoginDAO {

	
	@Autowired
	private SqlSession session;
	
	private static String namespace
	= "org.zerock.mapper.LoginMapper";
	
	@Override
	public String login(UserVO vo) {
		// TODO Auto-generated method stub
		LoginMapper mapper = session.getMapper(LoginMapper.class);
		UserVO temp = mapper.login(vo);
		if(temp != null) return "success";
		else return null;
	}
	

}
