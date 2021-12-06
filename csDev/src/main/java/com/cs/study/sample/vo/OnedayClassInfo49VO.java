package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("onedayClassInfo49VO")
// 영화-개봉예정작
public class OnedayClassInfo49VO {
	private String ociIdx;				// 고유 번호
	private String ociWriter;			// 작성자
	private String ociTitle;			// 제목
	private String ociContent;			// 내용
	private String ociWriteDay;			// 작성 일자
}
