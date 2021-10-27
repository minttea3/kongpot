package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.MovieComingSoon47VO;
@Mapper
public interface MovieComingSoon47Mapper {
	
	public MovieComingSoon47VO movieComingSoonSelectOne(MovieComingSoon47VO movieComingSoon47VO); 

	public List<MovieComingSoon47VO> movieComingSoonList(MovieComingSoon47VO movieComingSoon47VO);
	
	public int insertMovieComingSoon(MovieComingSoon47VO movieComingSoon47VO); 
	
	public int saveMovieComingSoon(MovieComingSoon47VO movieComingSoon47VO); 
	
	public int updateMovieComingSoon(MovieComingSoon47VO movieComingSoon47VO); 
	
	public int deleteMovieComingSoon(MovieComingSoon47VO movieComingSoon47VO);
}
