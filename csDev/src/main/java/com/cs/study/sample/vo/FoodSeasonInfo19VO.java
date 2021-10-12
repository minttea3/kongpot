package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("foodSeasonInfo19VO")
// 음식 - 계절음식 소개
public class FoodSeasonInfo19VO {
	private String fsiIdx; 					// 번호
	private String fsiName; 				// 글쓴이
	private String fsiIngredients;			// 재료
	private String fsiTitle; 				// 제목
	private String fsiContent; 				// 내용
	
}