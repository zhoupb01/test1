package com.zhoupb.test1.model.entity;

public class User extends BaseEntity {

	private String mobile;

	private String nickname;

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

}
