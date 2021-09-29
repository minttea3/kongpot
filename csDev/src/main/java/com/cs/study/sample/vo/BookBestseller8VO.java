package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("bookBestseller8VO")
// 베스트 셀러 소개
public class BookBestseller8VO {
	private String bbIdx; 				// 번호
	private String bbGenre; 			// 장르
	private String bbTitle; 			// 제목
	private String bbWriter;			// 작가
	private String bbCount;				// 별점
	private String bbPrice;				// 금액
	private String bbPublicationDate;	// 출판일자
	private String bbStory;				// 줄거리
}