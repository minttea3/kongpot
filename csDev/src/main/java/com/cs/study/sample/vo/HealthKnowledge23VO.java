package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("healthKnowledge23VO")
// 건강 - 지식 소개
public class HealthKnowledge23VO {
	private String hkIdx; 				// 번호
	private String hkName; 				// 글쓴이
	private String hkTitle; 			// 제목
	private String hkContent;			// 내용
	private String hkDate;				// 날짜
}