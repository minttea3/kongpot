package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.BookForeignNovelsInfo7VO;
import com.cs.study.sample.vo.BookKoreanNovelsInfo6VO;
import com.cs.study.sample.vo.CodingInfo3VO;
@Mapper
public interface BookForeignNovelsInfo7Mapper {
	
	public BookForeignNovelsInfo7VO bookForeignNovelsInfoSelectOne(BookForeignNovelsInfo7VO bookForeignNovelsInfo7VO); 

	public List<BookForeignNovelsInfo7VO> bookForeignNovelsInfoList(BookForeignNovelsInfo7VO bookForeignNovelsInfo7VO);
	
	public int insertBookForeignNovelsInfo(BookForeignNovelsInfo7VO bookForeignNovelsInfo7VO); 
	
	public int saveBookForeignNovelsInfo(BookForeignNovelsInfo7VO bookForeignNovelsInfo7VO); 
	
	public int updateBookForeignNovelsInfo(BookForeignNovelsInfo7VO bookForeignNovelsInfo7VO);
	
	public int deleteBookForeignNovelsInfo(BookForeignNovelsInfo7VO bookForeignNovelsInfo7VO); 
}
