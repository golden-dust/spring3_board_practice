package com.goldendust.board.dto;

public class Post {
		
	private String userId;
	private String title;
	private String content;
	

	public Post() {
		super();
	}
	
	public Post(String userId, String title, String content) {
		this.userId = userId;
		this.title = title;
		this.content = content;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String id) {
		this.userId = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}
