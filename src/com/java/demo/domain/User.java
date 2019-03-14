package com.java.demo.domain;

import java.io.Serializable;

public class User implements Serializable {
	private Integer u_id;
	private String u_username;
	private String u_password;
	private Integer u_money;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getU_id() {
		return u_id;
	}

	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}

	public String getU_username() {
		return u_username;
	}

	public void setU_username(String u_username) {
		this.u_username = u_username;
	}

	public String getU_password() {
		return u_password;
	}

	public void setU_password(String u_password) {
		this.u_password = u_password;
	}

	public Integer getU_money() {
		return u_money;
	}

	public void setU_money(Integer u_money) {
		this.u_money = u_money;
	}

	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", u_username=" + u_username + ", u_password=" + u_password + ", u_money="
				+ u_money + "]";
	}

}
