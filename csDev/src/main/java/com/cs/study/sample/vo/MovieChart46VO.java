package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("movieChart46VO")
// 영화-차트
public class MovieChart46VO {
	private String mcIdx;				// 고유 번호
	private String mcMovieTitle;		// 영화 제목
	private String mcReservationRate;	// 예매율
	private String mcCount;				// 별점
	private String mcReleaseDate;		// 개봉일
}
