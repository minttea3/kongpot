package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.BookKoreanNovelsInfo6VO;
import com.cs.study.sample.vo.CodingInfo3VO;
@Mapper
public interface BookKoreanNovelsInfo6Mapper {
	
	public BookKoreanNovelsInfo6VO bookKoreanNovelsInfoSelectOne(BookKoreanNovelsInfo6VO bookKoreanNovelsInfo6VO); 

	public List<BookKoreanNovelsInfo6VO> bookKoreanNovelsInfoList(BookKoreanNovelsInfo6VO bookKoreanNovelsInfo6VO);
	
	public int insertBookKoreanNovelsInfo(BookKoreanNovelsInfo6VO bookKoreanNovelsInfo6VO); 
	
	public int saveBookKoreanNovelsInfo(BookKoreanNovelsInfo6VO bookKoreanNovelsInfo6VO); 
	
	public int updateBookKoreanNovelsInfo(BookKoreanNovelsInfo6VO bookKoreanNovelsInfo6VO); 
	
	public int deleteBookKoreanNovelsInfo(BookKoreanNovelsInfo6VO bookKoreanNovelsInfo6VO); 
}
