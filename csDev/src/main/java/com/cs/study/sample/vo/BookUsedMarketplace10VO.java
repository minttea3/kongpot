package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("bookUsedMarketplace10VO")
// 책 중고장터 
public class BookUsedMarketplace10VO {
	
	private String bumIdx; 			// 번호
	private String bumGenre; 			// 장르
	private String bumBookTitle;		// 책제목
	private String bumWriter; 			// 작가
	private String bumName;				// 작성자
	private String bumTitle;			// 글제목
	private String bumContent;			// 글내용
	private String bumPrice;			// 금액
	private String bumDate;				// 날짜
}