package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("aquariumfishExpoGuestbook40VO")
// 물고기 - 소개
public class AquariumfishExpoGuestbook40VO {
	private String aebIdx;			// 고유 번호
	private String aebExpoName;		// 박람회 이름
	private String aebWriter;		// 작성자 이름
	private String aebFeeling;		// 후기
	private String aebCount;		// 별점
}
