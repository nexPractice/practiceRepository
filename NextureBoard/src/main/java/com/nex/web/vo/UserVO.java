package com.nex.web.vo;

public class UserVO {
	private String id;
	private String pwd;
	
	
	public UserVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserVO(String id, String pwd) {
		super();
		this.id = id;
		this.pwd = pwd;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getId() {
		return id;
	}
	public String getPwd() {
		return pwd;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
