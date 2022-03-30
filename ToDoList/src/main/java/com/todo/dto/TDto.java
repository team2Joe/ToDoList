package com.todo.dto;

public class TDto {
	
	private int cid;
	private String uid;
	private String cname;
	private String content;
	private int check;
	private int importance;
	
	public TDto() {
		// TODO Auto-generated constructor stub
	}

	public TDto(int cid, String uid, String cname, String content, int check, int importance) {
		super();
		this.cid = cid;
		this.uid = uid;
		this.cname = cname;
		this.content = content;
		this.check = check;
		this.importance = importance;
	}
	
	



	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getCheck() {
		return check;
	}

	public void setCheck(int check) {
		this.check = check;
	}

	public int getImportance() {
		return importance;
	}

	public void setImportance(int importance) {
		this.importance = importance;
	}
	
	
	
}
