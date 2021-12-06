package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.MovieBlogger48Mapper;
import com.cs.study.sample.vo.MovieBlogger48VO;

@Service
public class MovieBlogger48Service {
	
	public final MovieBlogger48Mapper movieBlogger48Mapper;
	public MovieBlogger48Service(MovieBlogger48Mapper movieBlogger48Mapper) {
		this.movieBlogger48Mapper = movieBlogger48Mapper;
	}
	public MovieBlogger48VO movieBloggerSelectOne(MovieBlogger48VO movieBlogger48VO) {
		return movieBlogger48Mapper.movieBloggerSelectOne(movieBlogger48VO);
	}
	public List<MovieBlogger48VO> movieBloggerList(MovieBlogger48VO movieBlogger48VO){
		return movieBlogger48Mapper.movieBloggerList(movieBlogger48VO);
	}
	public int insertMovieBlogger(MovieBlogger48VO movieBlogger48VO) {
		String status = movieBlogger48VO.getMbStatus();
		if(status == null) {
			movieBlogger48VO.setMbStatus("N");
		}
		return movieBlogger48Mapper.insertMovieBlogger(movieBlogger48VO);
	}
	
	public int saveMovieBlogger(MovieBlogger48VO movieBlogger48VO) {
		return movieBlogger48Mapper.saveMovieBlogger(movieBlogger48VO);
	} 
	
	public int updateMovieBlogger(MovieBlogger48VO movieBlogger48VO) {
		String status = movieBlogger48VO.getMbStatus();
		if(status == null) {
			movieBlogger48VO.setMbStatus("N");
		}
		return movieBlogger48Mapper.updateMovieBlogger(movieBlogger48VO);
	} 
	
	public int deleteMovieBlogger(MovieBlogger48VO movieBlogger48VO) {
		return movieBlogger48Mapper.deleteMovieBlogger(movieBlogger48VO);
	} 
}
