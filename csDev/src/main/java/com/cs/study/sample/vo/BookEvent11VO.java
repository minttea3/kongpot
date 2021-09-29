package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("bookEvent11VO")
// book 이달의 행사
public class BookEvent11VO {
	private String beIdx; 				// 번호
	private String beName; 				// 작성자
	private String beTitle; 			// 제목
	private String beContent;			// 내용
	private String beFreeGift;			// 사은품
	private String beDate;				// 등록일
}