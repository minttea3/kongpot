package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("studyCertificateNotice12VO")
// 공부/자격증 - 공지사항
public class StudyCertificateNotice12VO {
	private String scnIdx; 				// 번호
	private String scnTitle; 			// 제목
	private String scnContent;			// 내용
	private String scnDate;				// 등록일
}