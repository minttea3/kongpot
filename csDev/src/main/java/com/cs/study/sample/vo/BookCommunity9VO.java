package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("bookCommunity9VO")
// 북 커뮤니티
public class BookCommunity9VO {
	private String bcIdx; 				// 번호
	private String bcGenre; 			// 장르
	private String bcBookTitle; 		// 제목
	private String bcWriter;			// 작가
	private String bcCount;				// 별점
	private String bcName;				// 작성자
	private String bcTitle;				// 게시판 작성 제목
	private String bcContent;			// 게시판 내용
	private String bcDate;				// 작성일자
	
}