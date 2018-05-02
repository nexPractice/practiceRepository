package com.nex.web.service;

import com.nex.web.vo.UserVO;

public interface LoginService {
	public UserVO login(UserVO vo) throws Exception;
}
