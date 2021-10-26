package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.MovieInfo44Mapper;
import com.cs.study.sample.vo.MovieInfo44VO;

@Service
public class MovieInfo44Service {
	
	public final MovieInfo44Mapper movieInfo44Mapper;
	public MovieInfo44Service(MovieInfo44Mapper movieInfo44Mapper) {
		this.movieInfo44Mapper = movieInfo44Mapper;
	}
	public MovieInfo44VO movieInfoSelectOne(MovieInfo44VO movieInfo44VO) {
		return movieInfo44Mapper.movieInfoSelectOne(movieInfo44VO);
	}
	public List<MovieInfo44VO> movieInfoList(MovieInfo44VO movieInfo44VO){
		return movieInfo44Mapper.movieInfoList(movieInfo44VO);
	}
	public int insertMovieInfo(MovieInfo44VO movieInfo44VO) {
		return movieInfo44Mapper.insertMovieInfo(movieInfo44VO);
	}
	
	public int saveMovieInfo(MovieInfo44VO movieInfo44VO) {
		return movieInfo44Mapper.saveMovieInfo(movieInfo44VO);
	} 
	
	public int updateMovieInfo(MovieInfo44VO movieInfo44VO) {
		return movieInfo44Mapper.updateMovieInfo(movieInfo44VO);
	} 
	
	public int deleteMovieInfo(MovieInfo44VO movieInfo44VO) {
		return movieInfo44Mapper.deleteMovieInfo(movieInfo44VO);
	} 
}
