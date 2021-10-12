package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("foodRecipe20VO")
// 음식 - 레시피 소개
public class FoodRecipe20VO {
	private String frIdx; 					// 번호
	private String frName; 					// 글쓴이
	private String frType;					// 분류
	private String frTitle; 				// 제목
	private String frContent; 				// 내용

}