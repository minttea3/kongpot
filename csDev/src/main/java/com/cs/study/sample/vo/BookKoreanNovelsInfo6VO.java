package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("BookKoreanNovelsInfo6VO")
// 국내 소설 소개
public class BookKoreanNovelsInfo6VO {
	private String bkIdx; 				// 번호
	private String bkGenre; 			// 장르
	private String bkTitle; 			// 책제목
	private String bkWriter;			// 작가
	private String bkCount;				// 별점
	private String bkPrice;				// 금액
	private String bkPublicationDate;	// 출판일자
	private String bkStory;				// 줄거리

}