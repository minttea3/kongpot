package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("aquariumfishSellInfo43VO")
// 물고기 - 소개
public class AquariumfishSellInfo43VO {
	private String asiiIdx;				// 고유 번호
	private String asiiStoreName;		// 상호명
	private String asiiProduct;			// 판매 품목
	private String asiiPrice;			// 가격
	private String asiiDate;			// 작성일자
}
