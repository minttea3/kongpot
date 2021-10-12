package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("foodBlogger21VO")
// 음식 - 블로거 
public class FoodBlogger21VO {
	private String fbIdx; 					// 번호
	private String fbName; 					// 글쓴이
	private String fbType;					// 분류
	private String fbTitle; 				// 제목
	private String fbContent; 				// 내용

}