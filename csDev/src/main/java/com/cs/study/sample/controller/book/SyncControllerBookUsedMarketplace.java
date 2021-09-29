package com.cs.study.sample.controller.book;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.BookBestseller8Service;
import com.cs.study.sample.service.BookForeignNovelsInfo7Service;
import com.cs.study.sample.service.BookKoreanNovelsInfo6Service;
import com.cs.study.sample.service.BookUsedMarketplace10Service;
import com.cs.study.sample.vo.BookBestseller8VO;
import com.cs.study.sample.vo.BookForeignNovelsInfo7VO;
import com.cs.study.sample.vo.BookKoreanNovelsInfo6VO;
import com.cs.study.sample.vo.BookUsedMarketplace10VO;

@Controller
public class SyncControllerBookUsedMarketplace {

	
	  private final BookUsedMarketplace10Service bookUsedMarketplace10Service;
	  
	  public SyncControllerBookUsedMarketplace(BookUsedMarketplace10Service bookUsedMarketplace10Service) { 
		  this.bookUsedMarketplace10Service = bookUsedMarketplace10Service;
	  }
	 
	@GetMapping("/bookUsedMarketplaceList")
	public String bookBestSellerInfoList(Model model, BookUsedMarketplace10VO  bookUsedMarketplace10VO) {
		List<BookUsedMarketplace10VO> bookUsedMarketplaceList = bookUsedMarketplace10Service.bookUsedMarketplaceList(bookUsedMarketplace10VO);
		model.addAttribute("bookUsedMarketplaceList", bookUsedMarketplaceList);
		model.addAttribute("bookUsedMarketplace10VO",bookUsedMarketplace10VO);
		
		return "sample/book/bookUsedMarketplaceList";
	}
	
	  @GetMapping("/syncBookUsedMarketplaceForm") 
	  public String syncBookBestSellerForm(Model model, BookUsedMarketplace10VO  bookUsedMarketplace10VO){
			
			  if (!StringUtils.isEmpty( bookUsedMarketplace10VO.getBumIdx() )){ 
				  BookUsedMarketplace10VO bookUsedMarketplaceSelectOne = bookUsedMarketplace10Service.bookUsedMarketplaceSelectOne(bookUsedMarketplace10VO);
			  model.addAttribute("bookUsedMarketplace10VO", bookUsedMarketplaceSelectOne); 
			  }
	  return "sample/book/syncBookUsedMarketplaceForm"; 
	  }
	 
	
	  @PostMapping("/syncBookUsedMarketplaceFormSave") 
	  public String syncBookBestsellerFormSave(Model  model, BookUsedMarketplace10VO  bookUsedMarketplace10VO, @RequestParam(value="action", required=true) String action){ 
		  if ( "insert".equals(action) ){ 
			  int insertCnt = bookUsedMarketplace10Service.insertBookUsedMarketplace(bookUsedMarketplace10VO);
			  
		  }else if ( "update".equals(action) ){
			  int updateCnt = bookUsedMarketplace10Service.updateBookUsedMarketplace(bookUsedMarketplace10VO);
		  }else if (
			  "delete".equals(action) ){ 
			  int deleteCnt = bookUsedMarketplace10Service.deleteBookUsedMarketplace(bookUsedMarketplace10VO);
		  } 
		  return "redirect:bookUsedMarketplaceList";
	  }
	 
}
