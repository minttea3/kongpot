package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.MovieInfo44VO;
@Mapper
public interface MovieInfo44Mapper {
	
	public MovieInfo44VO movieInfoSelectOne(MovieInfo44VO movieInfo44VO); 

	public List<MovieInfo44VO> movieInfoList(MovieInfo44VO movieInfo44VO);
	
	public int insertMovieInfo(MovieInfo44VO movieInfo44VO); 
	
	public int saveMovieInfo(MovieInfo44VO movieInfo44VO); 
	
	public int updateMovieInfo(MovieInfo44VO movieInfo44VO); 
	
	public int deleteMovieInfo(MovieInfo44VO movieInfo44VO);
}
