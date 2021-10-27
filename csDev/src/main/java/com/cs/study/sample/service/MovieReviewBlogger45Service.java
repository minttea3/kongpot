package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.MovieReviewBlogger45Mapper;
import com.cs.study.sample.vo.MovieReviewBlogger45VO;

@Service
public class MovieReviewBlogger45Service {
	
	public final MovieReviewBlogger45Mapper movieReviewBlogger45Mapper;
	public MovieReviewBlogger45Service(MovieReviewBlogger45Mapper movieReviewBlogger45Mapper) {
		this.movieReviewBlogger45Mapper = movieReviewBlogger45Mapper;
	}
	public MovieReviewBlogger45VO movieReviewBloggerSelectOne(MovieReviewBlogger45VO movieReviewBlogger45VO) {
		return movieReviewBlogger45Mapper.movieReviewBloggerSelectOne(movieReviewBlogger45VO);
	}
	public List<MovieReviewBlogger45VO> movieReviewBloggerList(MovieReviewBlogger45VO movieReviewBlogger45VO){
		return movieReviewBlogger45Mapper.movieReviewBloggerList(movieReviewBlogger45VO);
	}
	public int insertMovieReviewBlogger(MovieReviewBlogger45VO movieReviewBlogger45VO) {
		return movieReviewBlogger45Mapper.insertMovieReviewBlogger(movieReviewBlogger45VO);
	}
	
	public int saveMMovieReviewBlogger(MovieReviewBlogger45VO movieReviewBlogger45VO) {
		return movieReviewBlogger45Mapper.saveMMovieReviewBlogger(movieReviewBlogger45VO);
	} 
	
	public int updateMovieReviewBlogger(MovieReviewBlogger45VO movieReviewBlogger45VO) {
		return movieReviewBlogger45Mapper.updateMovieReviewBlogger(movieReviewBlogger45VO);
	} 
	
	public int deleteMovieReviewBlogger(MovieReviewBlogger45VO movieReviewBlogger45VO) {
		return movieReviewBlogger45Mapper.deleteMovieReviewBlogger(movieReviewBlogger45VO);
	} 
}
