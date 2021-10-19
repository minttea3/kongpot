package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("plantsBlog33VO")
// 식물 - 블로그
public class PlantsBlog33VO {
	private String pbsIdx; 				// 번호
	private String pbsName; 			// 작성자
	private String pbsTitle; 			// 제목
	private String pbsContent; 			// 내용
	private String pbsDay; 				// 날짜
}