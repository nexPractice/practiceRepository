package com.nex.web.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nex.web.vo.UserVO;

@Repository
public class LoginDAOImpl implements LoginDAO {

	
	@Inject
	private SqlSession session;
	
	private static String namespace
	= "org.zerock.mapper.LoginMapper";
	
	@Override
	public UserVO login(UserVO vo) {
		// TODO Auto-generated method stub
		LoginMapper mapper = session.getMapper(LoginMapper.class);
		return mapper.login(vo);
	}
	

}
