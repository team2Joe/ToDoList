package com.todo.dto;

public class UDto {
	
	public String uid;
	private String upassword;
	private String uname;
	private String uphone;
	private String uquestion;
	private String uanswer;
	
	public UDto() {
	}

	public UDto(String uid, String upassword, String uname, String uphone, String uquestion, String uanswer) {
		super();
		this.uid = uid;
		this.upassword = upassword;
		this.uname = uname;
		this.uphone = uphone;
		this.uquestion = uquestion;
		this.uanswer = uanswer;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUphone() {
		return uphone;
	}

	public void setUphone(String uphone) {
		this.uphone = uphone;
	}

	public String getUanswer() {
		return uanswer;
	}

	public void setUanswer(String uanswer) {
		this.uanswer = uanswer;
	}

	public String getUquestion() {
		return uquestion;
	}

	public void setUquestion(String uquestion) {
		this.uquestion = uquestion;
	}
	
	
	
}
