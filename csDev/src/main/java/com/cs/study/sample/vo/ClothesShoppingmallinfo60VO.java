package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("clothesShoppingmallinfo60VO")
// 옷 쇼핑몰 정보
public class ClothesShoppingmallinfo60VO {
	private int	   csiIdx;				// 고유 번호
	private String csiStoreName;		// 상호명
	private String csiStyle;			// 스타일
	private String csiStoreStatus;		// 매장 여부
	private String csiCount;			// 평점
}
