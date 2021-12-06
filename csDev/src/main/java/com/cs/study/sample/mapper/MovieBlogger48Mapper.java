package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.MovieBlogger48VO;
@Mapper
public interface MovieBlogger48Mapper {
	
	public MovieBlogger48VO movieBloggerSelectOne(MovieBlogger48VO movieBlogger48VO); 

	public List<MovieBlogger48VO> movieBloggerList(MovieBlogger48VO movieBlogger48VO);
	
	public int insertMovieBlogger(MovieBlogger48VO movieBlogger48VO); 
	
	public int saveMovieBlogger(MovieBlogger48VO movieBlogger48VO); 
	
	public int updateMovieBlogger(MovieBlogger48VO movieBlogger48VO); 
	
	public int deleteMovieBlogger(MovieBlogger48VO movieBlogger48VO);
}
