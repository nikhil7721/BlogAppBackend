package com.blog.services;

import com.blog.payloads.CommentDto;
import com.blog.payloads.PostDto;

public interface CommentServices {
	
	
	//create
	
	
	
	CommentDto createComment(CommentDto commentDto, Integer postId);

	void deleteComment(Integer commentId);
}
