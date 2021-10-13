package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("healthCommunityComment28VO")
// 건강 - 커뮤니티
public class HealthCommunityComment28VO {
	private String hcIdx; 				// 커뮤니티 게시판 고유 번호
	private String hccIdx; 				// 번호
	private String hccName; 			// 글쓴이
	private String hccContent;			// 내용
}