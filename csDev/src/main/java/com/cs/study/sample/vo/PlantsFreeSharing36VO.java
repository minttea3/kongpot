package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("plantsFreeSharing36VO")
// 식물 - 무료 나눔
public class PlantsFreeSharing36VO {
	private String pfsIdx; 				// 번호
	private String pfsType; 			// 식물 종류
	private String pfsTitle; 			// 제목
	private String pfsContent; 			// 내용
	private String pfsDay; 				// 날짜
}