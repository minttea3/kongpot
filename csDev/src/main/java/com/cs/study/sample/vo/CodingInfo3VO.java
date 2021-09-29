package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("codingInfo3VO")
//코딩  정보
public class CodingInfo3VO {
	private String ciIdx; 		// 번호
	private String ciName; 		// 작성자
	private String ciTitle; 	// 제목
	private String ciContent;	// 내용
	private String ciDate;		// 날짜
}
