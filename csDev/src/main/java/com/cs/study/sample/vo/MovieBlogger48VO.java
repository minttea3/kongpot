package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("movieBlogger48VO")
// 영화-개봉예정작
public class MovieBlogger48VO {
	private String mbIdx;				// 고유 번호
	private String mbBlogger;			// 블로거
	private String mbMovieTitle;		// 영화 제목
	private String mbCount;				// 별점
	private String mbStatus;			// 활동 여부
}
