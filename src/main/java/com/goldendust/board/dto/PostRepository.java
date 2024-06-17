package com.goldendust.board.dto;

import java.util.ArrayList;
import java.util.List;

public class PostRepository{
	
	private List<Post> postRepository;
	
	public  PostRepository() {
		this.postRepository = new ArrayList<Post>();
	}
	
	public List<Post> getPostRepository() {
		return this.postRepository;
	}
	
	public void setPostRepository(Post post) {
		this.postRepository = new ArrayList<Post>();
		this.postRepository.add(post);
	}

}
