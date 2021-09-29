package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("codingCommunityVO")
//커뮤니티
public class CodingCommunity4VO {
	private String ccIdx;		// 번호
	private String ccName;		// 작성자
	private String ccTitle;		// 제목 
	private String ccContent;	// 내용
	private String ccDate;		// 날짜
					
}
