package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.BookCommunity9VO;
import com.cs.study.sample.vo.BookUsedMarketplace10VO;
@Mapper
public interface BookUsedMarketplace10Mapper {
	
	public BookUsedMarketplace10VO bookUsedMarketplaceSelectOne(BookUsedMarketplace10VO bookUsedMarketplace10VO); 

	public List<BookUsedMarketplace10VO> bookUsedMarketplaceList(BookUsedMarketplace10VO bookUsedMarketplace10VO);
	
	public int insertBookUsedMarketplace(BookUsedMarketplace10VO bookUsedMarketplace10VO); 
	
	public int saveBookUsedMarketplace(BookUsedMarketplace10VO bookUsedMarketplace10VO); 
	
	public int updateBookUsedMarketplace(BookUsedMarketplace10VO bookUsedMarketplace10VO); 
	
	public int deleteBookUsedMarketplace(BookUsedMarketplace10VO bookUsedMarketplace10VO);
}
