package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("movieInfo44VO")
// 물고기 - 소개
public class MovieInfo44VO {
	private String miIdx;			// 고유 번호
	private String miMovieTitle;	// 영화 제목
	private String miGenre;			// 장르
	private String miPrice;			// 가격
	private String miReleaseDate;	// 개봉일
}
