package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.MovieChart46VO;
@Mapper
public interface MovieChart46Mapper {
	
	public MovieChart46VO movieChartSelectOne(MovieChart46VO movieChart46VO); 

	public List<MovieChart46VO> movieChartList(MovieChart46VO movieChart46VO);
	
	public int insertMovieChart(MovieChart46VO movieChart46VO); 
	
	public int saveMovieChart(MovieChart46VO movieChart46VO); 
	
	public int updateMovieChart(MovieChart46VO movieChart46VO); 
	
	public int deleteMovieChart(MovieChart46VO movieChart46VO);
}
