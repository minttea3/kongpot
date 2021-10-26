package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("aquariumfishExpo39VO")
// 물고기 - 소개
public class AquariumfishExpo39VO {
	private String aeIdx;		// 고유 번호
	private String aeExpoName;	// 박람회 이름
	private String aeTitle;		// 제목
	private String aeContent;	// 내용
	private String aeStatus;	// 개최여부(Y/N)
}
