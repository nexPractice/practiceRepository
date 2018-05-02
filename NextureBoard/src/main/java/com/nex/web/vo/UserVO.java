package com.nex.web.vo;

public class UserVO {
	private String id;
	private String pwd;
	private int hidden;
	
	public UserVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserVO(String id, String pwd) {
		super();
		this.id = id;
		this.pwd = pwd;
	}
	public UserVO(String id, String pwd, int hidden) {
		this.id = id;
		this.pwd = pwd;
		this.hidden = hidden;
	}

	public String getId() {
		return id;
	}
	public String getPwd() {
		return pwd;
	}
	
	public int getHidden() {
		return hidden;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id : "+id+" pwd : "+pwd+" hidden : "+hidden;
	}
	
}
