package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.MovieChart46Mapper;
import com.cs.study.sample.vo.MovieChart46VO;

@Service
public class MovieChart46Service {
	
	public final MovieChart46Mapper movieChart46Mapper;
	public MovieChart46Service(MovieChart46Mapper movieChart46Mapper) {
		this.movieChart46Mapper = movieChart46Mapper;
	}
	public MovieChart46VO movieChartSelectOne(MovieChart46VO movieChart46VO) {
		return movieChart46Mapper.movieChartSelectOne(movieChart46VO);
	}
	public List<MovieChart46VO> movieChartList(MovieChart46VO movieChart46VO){
		return movieChart46Mapper.movieChartList(movieChart46VO);
	}
	public int insertMovieChart(MovieChart46VO movieChart46VO) {
		return movieChart46Mapper.insertMovieChart(movieChart46VO);
	}
	
	public int saveMovieChart(MovieChart46VO movieChart46VO) {
		return movieChart46Mapper.saveMovieChart(movieChart46VO);
	} 
	
	public int updateMovieChart(MovieChart46VO movieChart46VO) {
		return movieChart46Mapper.updateMovieChart(movieChart46VO);
	} 
	
	public int deleteMovieChart(MovieChart46VO movieChart46VO) {
		return movieChart46Mapper.deleteMovieChart(movieChart46VO);
	} 
}
