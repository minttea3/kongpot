package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("plantsInfo30VO")
// 식물 - 소개
public class PlantsInfo30VO {
	private String piIdx; 				// 번호
	private String piType; 				// 타입
	private String piName	; 			// 이름
	private String piTitle; 			// 제목
	private String piContent;			// 내용
}