package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("aquariumfishNews41VO")
// 물고기 - 소개
public class AquariumfishNews41VO {
	private String anIdx;			// 고유 번호
	private String anPress;			// 언론사
	private String anName;			// 기자 이름
	private String anTitle;			// 제목
	private String anContent;		// 내용
}
