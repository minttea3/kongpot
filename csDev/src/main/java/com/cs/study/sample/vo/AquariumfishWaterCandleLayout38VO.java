package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("aquariumfishWaterCandleLayout38VO")
// 물고기 - 수초 레이아웃
public class AquariumfishWaterCandleLayout38VO {
	private String awclIdx;				// 고유 번호
	private String awclActivities;		// 활동 사항
	private String awclTitle;			// 제목
	private String awclContent;			// 내용
	private String awclDay;				// 날짜
}
