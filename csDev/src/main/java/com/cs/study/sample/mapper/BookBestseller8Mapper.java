package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.BookBestseller8VO;
import com.cs.study.sample.vo.BookForeignNovelsInfo7VO;
import com.cs.study.sample.vo.BookKoreanNovelsInfo6VO;
import com.cs.study.sample.vo.CodingInfo3VO;
@Mapper
public interface BookBestseller8Mapper {
	
	public BookBestseller8VO bookBestsellerSelectOne(BookBestseller8VO bookBestseller8VO); 

	public List<BookBestseller8VO> bookBestsellerList(BookBestseller8VO bookBestseller8VO);
	
	public int insertBookBestseller(BookBestseller8VO bookBestseller8VO); 
	
	public int saveBookBestseller(BookBestseller8VO bookBestseller8VO); 
	
	public int updateBookBestseller(BookBestseller8VO bookBestseller8VO); 
	
	public int deleteBookBestseller(BookBestseller8VO bookBestseller8VO);
}
