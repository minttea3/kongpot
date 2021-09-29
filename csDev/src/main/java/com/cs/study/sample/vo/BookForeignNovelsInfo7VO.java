package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("BookForeignNovelsInfo7VO")
//국외 소설 소개
public class BookForeignNovelsInfo7VO {
	private String bfIdx; 				// 번호
	private String bfGenre; 			// 장르
	private String bfTitle; 			// 책 제목
	private String bfWriter;			// 작가
	private String bfCount;				// 별점
	private String bfPrice;				// 금액
	private String bfPublicationDate;	// 출판일자
	private String bfStory;				// 줄거리
}