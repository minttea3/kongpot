package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("healthCommunity27VO")
// 건강 - 커뮤니티
public class HealthCommunity27VO {
	private String hcIdx; 				// 번호
	private String hcName; 				// 글쓴이
	private String hcTitle; 			// 제목
	private String hcContent;			// 내용
}