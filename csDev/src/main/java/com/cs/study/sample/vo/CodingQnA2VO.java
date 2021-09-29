package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("codingQnA2VO")
//�ڵ� Q&A ���̺�
public class CodingQnA2VO {
	private String cIdx;		// 번호
	private String cName;		// 작성자
	private String cType;		// 문의 종류
	private String cTitle;		// 제목
	private String cContent;	// 내용
	private String cDate;		// 날짜

}
