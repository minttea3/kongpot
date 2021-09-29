package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.BookBestseller8VO;
import com.cs.study.sample.vo.BookEvent11VO;
import com.cs.study.sample.vo.BookForeignNovelsInfo7VO;
import com.cs.study.sample.vo.BookKoreanNovelsInfo6VO;
import com.cs.study.sample.vo.CodingInfo3VO;
@Mapper
public interface BookEvent11Mapper {
	
	public BookEvent11VO bookEventSelectOne(BookEvent11VO bookEvent11VO); 

	public List<BookEvent11VO> bookEventList(BookEvent11VO bookEvent11VO);
	
	public int insertBookEvent(BookEvent11VO bookEvent11VO); 
	
	public int saveBookEvent(BookEvent11VO bookEvent11VO); 
	
	public int updateBookEvent(BookEvent11VO bookEvent11VO); 
	
	public int deleteBookBestseller(BookEvent11VO bookEvent11VO);
}
