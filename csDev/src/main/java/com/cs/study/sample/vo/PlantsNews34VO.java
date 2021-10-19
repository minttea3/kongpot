package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("plantsNews34VO")
// 식물 - 뉴스
public class PlantsNews34VO {
	private String pnIdx; 				// 번호
	private String pnType; 				// 작성자
	private String pnTitle; 			// 제목
	private String pnContent; 			// 내용
	private String pnDay; 				// 날짜
}