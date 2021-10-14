package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("plantsBirthFlower29VO")
// 식물 - 탄생화 소개
public class PlantsBirthFlower29VO {
	private String pbfIdx; 				// 번호
	private String pbfMonth; 			// 월
	private String pbfType; 			// 종류
	private String pbfTitle; 			// 제목
	private String pbfContent;			// 내용
}