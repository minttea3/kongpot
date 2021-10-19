package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("plantsEvent35VO")
// 식물 - 이벤트
public class PlantsEvent35VO {
	private String peIdx; 				// 번호
	private String peType; 				// 작성자
	private String peTitle; 			// 제목
	private String peContent; 			// 내용
	private String peDay; 				// 날짜
}