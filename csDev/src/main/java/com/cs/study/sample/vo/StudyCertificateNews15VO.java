package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("studyCertificateNews15VO")
// 공부/자격증 - 공지사항
public class StudyCertificateNews15VO {
	private String scnsIdx; 			// 번호
	private String scnsName; 			// 글쓴이
	private String scnsTitle; 			// 제목
	private String scnsImage;			// 이미지
	private String scnsContent;			// 내용
	private String scnsWriteDay;		// 작성일자
}