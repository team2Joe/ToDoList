package com.todo.dto;

public class TDto {
	
	private int order;
	private String uid;
	private String cname;
	private String content;
	private int check;
	private int importance;
	
	public TDto() {
		// TODO Auto-generated constructor stub
	}

	public TDto(int order, String uid, String cname, String content, int check, int importance) {
		super();
		this.order = order;
		this.uid = uid;
		this.cname = cname;
		this.content = content;
		this.check = check;
		this.importance = importance;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
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
