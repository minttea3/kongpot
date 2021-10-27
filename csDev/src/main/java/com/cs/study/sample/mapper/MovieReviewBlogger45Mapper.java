package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.MovieReviewBlogger45VO;
@Mapper
public interface MovieReviewBlogger45Mapper {
	
	public MovieReviewBlogger45VO movieReviewBloggerSelectOne(MovieReviewBlogger45VO movieReviewBlogger45VO); 

	public List<MovieReviewBlogger45VO> movieReviewBloggerList(MovieReviewBlogger45VO movieReviewBlogger45VO);
	
	public int insertMovieReviewBlogger(MovieReviewBlogger45VO movieReviewBlogger45VO); 
	
	public int saveMMovieReviewBlogger(MovieReviewBlogger45VO movieReviewBlogger45VO); 
	
	public int updateMovieReviewBlogger(MovieReviewBlogger45VO movieReviewBlogger45VO); 
	
	public int deleteMovieReviewBlogger(MovieReviewBlogger45VO movieReviewBlogger45VO);
}
