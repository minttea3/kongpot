package com.cs.study.sample.controller.book;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.BookBestseller8Service;
import com.cs.study.sample.service.BookCommunity9Service;
import com.cs.study.sample.vo.BookBestseller8VO;
import com.cs.study.sample.vo.BookCommunity9VO;

@Controller
public class SyncControllerBookCommunity {

	
	  private final BookCommunity9Service bookCommunity9Service;
	  
	  public SyncControllerBookCommunity(BookCommunity9Service bookCommunity9Service) { 
		  this.bookCommunity9Service = bookCommunity9Service;
	  }
	 
	@GetMapping("/bookCommunityList")
	public String bookBestSellerInfoList(Model model, BookCommunity9VO  bookCommunity9VO) {
		
		List<BookCommunity9VO> bookCommunityList = bookCommunity9Service.bookCommunityList(bookCommunity9VO);
		model.addAttribute("bookCommunityList",bookCommunityList);
		model.addAttribute("bookCommunity9VO",bookCommunity9VO);
		
		return "sample/book/bookCommunityList";
	}
	
	  @GetMapping("/syncBookBCommunityForm") 
	  public String syncBookBestSellerForm(Model model, BookCommunity9VO  bookCommunity9VO){
			
			  if (!StringUtils.isEmpty( bookCommunity9VO.getBcIdx() )){ 
				  BookCommunity9VO bookCommunitySelectOne = bookCommunity9Service.bookCommunitySelectOne(bookCommunity9VO);
			  model.addAttribute("bookCommunity9VO", bookCommunitySelectOne); 
			  }
	  return "sample/book/syncBookBCommunityForm"; 
	  }
	 
	
	  @PostMapping("/syncBookBCommunityFormSave") 
	  public String syncBookBestsellerFormSave(Model  model, BookCommunity9VO  bookCommunity9VO, @RequestParam(value="action", required=true) String action){ 
		  if ( "insert".equals(action) ){ 
			  int insertCnt = bookCommunity9Service.insertBookCommunity(bookCommunity9VO);
			  
		  }else if ( "update".equals(action) ){
			  int updateCnt = bookCommunity9Service.updateBookCommunity(bookCommunity9VO); 
		  }else if (
			  "delete".equals(action) ){ 
			  int deleteCnt = bookCommunity9Service.deleteBookCommunity(bookCommunity9VO); 
		  } 
		  return "redirect:bookCommunityList";
	  }
	 
}
