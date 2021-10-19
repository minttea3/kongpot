package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("plantsBlogger32VO")
// 식물 - 블로거
public class PlantsBlogger32VO {
	private String pbIdx; 				// 번호
	private String pbName; 				// 타입
	private String pbTitle; 			// 제목
	private String pbActivityStatus;	// 현재 활동 여부
}