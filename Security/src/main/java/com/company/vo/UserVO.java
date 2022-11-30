package com.company.vo;

import java.sql.Date;

public class UserVO {

	private int id;
	private String userId;
	private String password;
	private String userName;
	private String nickName;
	private String address;
	private String email;
	private int tel;
	private String birthDate;
	private String cpcode;
	private String cdstf;
	private int usergrade;
	private Date last_login;
	private Date create_time;
	private Date update_time;
	private String Domain;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getCpcode() {
		return cpcode;
	}
	public void setCpcode(String cpcode) {
		this.cpcode = cpcode;
	}
	public String getCdstf() {
		return cdstf;
	}
	public void setCdstf(String cdstf) {
		this.cdstf = cdstf;
	}
	public int getUsergrade() {
		return usergrade;
	}
	public void setUsergrade(int usergrade) {
		this.usergrade = usergrade;
	}
	public Date getLast_login() {
		return last_login;
	}
	public void setLast_login(Date last_login) {
		this.last_login = last_login;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Date getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
	public String getDomain() {
		return Domain;
	}
	public void setDomain(String domain) {
		Domain = domain;
	}
	
	@Override
	public String toString() {
		return "UserVO [id=" + id + ", userId=" + userId + ", password=" + password + ", userName=" + userName
				+ ", nickName=" + nickName + ", address=" + address + ", email=" + email + ", tel=" + tel
				+ ", birthDate=" + birthDate + ", cpcode=" + cpcode + ", cdstf=" + cdstf + ", usergrade=" + usergrade
				+ ", last_login=" + last_login + ", create_time=" + create_time + ", update_time=" + update_time
				+ ", Domain=" + Domain + "]";
	}

	
	
	
	
	

	
	
}
