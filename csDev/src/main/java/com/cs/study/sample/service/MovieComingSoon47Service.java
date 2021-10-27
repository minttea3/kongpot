package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.MovieComingSoon47Mapper;
import com.cs.study.sample.vo.MovieComingSoon47VO;

@Service
public class MovieComingSoon47Service {
	
	public final MovieComingSoon47Mapper movieComingSoon47Mapper;
	public MovieComingSoon47Service(MovieComingSoon47Mapper movieComingSoon47Mapper) {
		this.movieComingSoon47Mapper = movieComingSoon47Mapper;
	}
	public MovieComingSoon47VO movieComingSoonSelectOne(MovieComingSoon47VO movieComingSoon47VO) {
		return movieComingSoon47Mapper.movieComingSoonSelectOne(movieComingSoon47VO);
	}
	public List<MovieComingSoon47VO> movieComingSoonList(MovieComingSoon47VO movieComingSoon47VO){
		return movieComingSoon47Mapper.movieComingSoonList(movieComingSoon47VO);
	}
	public int insertMovieComingSoon(MovieComingSoon47VO movieComingSoon47VO) {
		return movieComingSoon47Mapper.insertMovieComingSoon(movieComingSoon47VO);
	}
	
	public int saveMovieComingSoon(MovieComingSoon47VO movieComingSoon47VO) {
		return movieComingSoon47Mapper.saveMovieComingSoon(movieComingSoon47VO);
	} 
	
	public int updateMovieComingSoon(MovieComingSoon47VO movieComingSoon47VO) {
		return movieComingSoon47Mapper.updateMovieComingSoon(movieComingSoon47VO);
	} 
	
	public int deleteMovieComingSoon(MovieComingSoon47VO movieComingSoon47VO) {
		return movieComingSoon47Mapper.deleteMovieComingSoon(movieComingSoon47VO);
	} 
}
