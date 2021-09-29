package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.BookCommunity9VO;
@Mapper
public interface BookCommuntiy9Mapper {
	
	public BookCommunity9VO bookCommunitySelectOne(BookCommunity9VO bookCommunity9VO); 

	public List<BookCommunity9VO> bookCommunityList(BookCommunity9VO bookCommunity9VO);
	
	public int insertBookCommunity(BookCommunity9VO bookCommunity9VO); 
	
	public int saveBookCommunity(BookCommunity9VO bookCommunity9VO); 
	
	public int updateBookCommunity(BookCommunity9VO bookCommunity9VO); 
	
	public int deleteBookCommunity(BookCommunity9VO bookCommunity9VO);
}
