package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("movieReviewBlogger45VO")
// 물고기 - 소개
public class MovieReviewBlogger45VO {
	private String mrbIdx;				// 고유 번호
	private String mrbMovieTitle;		// 영화 제목
	private String mrbGenre;			// 장르
	private String mrbContent;			// 내용
	private String mrbScore;			// 별점
}
