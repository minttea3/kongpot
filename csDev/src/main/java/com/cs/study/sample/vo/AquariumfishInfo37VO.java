package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("aquariumfishInfo37VO")
// 물고기 - 소개
public class AquariumfishInfo37VO {
	private String aiIdx;		// 고유 번호
	private String aiType;		// 종류
	private String aiWriter;	// 작성자
	private String aiTitle;		// 제목
	private String aiContent;	// 내용
}
