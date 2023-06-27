package com.bo;

import java.util.Objects;

public class loginBo {
	
private String email;
private String adminpassword;

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}


/**
 * @return the adminpassword
 */
public String getAdminpassword() {
	return adminpassword;
}

/**
 * @param adminpassword the adminpassword to set
 */
public void setAdminpassword(String adminpassword) {
	this.adminpassword = adminpassword;
}


public loginBo(String email, String adminpassword) {
	super();
	this.email = email;
	this.adminpassword = adminpassword;
}

public loginBo() {
	super();
	// TODO Auto-generated constructor stub
}









}
