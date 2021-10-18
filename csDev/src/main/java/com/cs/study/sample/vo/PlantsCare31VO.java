package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("plantsCare31VO")
// 식물 - 식물관리법
public class PlantsCare31VO {
	private String pbfIdx; 				// 번호
	private String pbfType; 			// 타입
	private String pbfTitle; 			// 제목
	private String pbfContent;			// 내용
	private String pbfDate;				// 작성일자
}