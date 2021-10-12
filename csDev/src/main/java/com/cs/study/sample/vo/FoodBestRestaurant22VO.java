package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("foodBestRestaurant22VO")
// 음식 - 맛집 
public class FoodBestRestaurant22VO {
	private String fbrIdx; 					// 번호
	private String fbrName; 				// 글쓴이
	private String fbrType;					// 분류
	private String fbrTitle; 				// 제목
	private String fbrContent; 				// 내용

}