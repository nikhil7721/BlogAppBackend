package com.blog.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.entities.Comment;
import com.blog.entities.Post;
import com.blog.expection.ResourceNotFoundException;
import com.blog.payloads.CommentDto;
import com.blog.repository.CommentRepo;
import com.blog.repository.PostRepo;
import com.blog.services.CommentServices;

@Service
public class CommentServiceImpl implements CommentServices {
	
	@Autowired
	public PostRepo postRepo;
	
	@Autowired
	public CommentRepo commentRepo;
	
	@Autowired
	public ModelMapper modelMapper;

	@Override
	public CommentDto createComment(CommentDto commentDto, Integer postId) {
	
		Post post= this.postRepo.findById(postId)
				.orElseThrow(()-> new ResourceNotFoundException("Post","post id",postId));
		
		Comment comment=this.modelMapper.map(commentDto,Comment.class);
		comment.setPost(post);
		Comment saveComment=this.commentRepo.save(comment);
		return this.modelMapper.map(saveComment, CommentDto.class);
				
	}

	@Override
	public void deleteComment(Integer commentId) {
		Comment com=this.commentRepo.findById(commentId)
				.orElseThrow(()->new ResourceNotFoundException("Comment","commentId",commentId));
		this.commentRepo.delete(com);
	}

}
