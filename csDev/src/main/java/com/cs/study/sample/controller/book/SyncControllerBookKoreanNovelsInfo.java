package com.cs.study.sample.controller.book;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.BookKoreanNovelsInfo6Service;
import com.cs.study.sample.vo.BookKoreanNovelsInfo6VO;

@Controller
public class SyncControllerBookKoreanNovelsInfo {

	
	  private final BookKoreanNovelsInfo6Service bookKoreanNovelsInfo6Service;
	  
	  public SyncControllerBookKoreanNovelsInfo(BookKoreanNovelsInfo6Service bookKoreanNovelsInfo6Service) { 
		  this.bookKoreanNovelsInfo6Service = bookKoreanNovelsInfo6Service;
	  }
	 
	@GetMapping("/bookKoreanNovelsList")
	public String bookKoreanNovelsList(Model model, BookKoreanNovelsInfo6VO  bookKoreanNovelsInfo6VO) {
		List<BookKoreanNovelsInfo6VO> selectKoreanNovelsInfo = bookKoreanNovelsInfo6Service.bookKoreanNovelsInfoList(bookKoreanNovelsInfo6VO);
		model.addAttribute("selectKoreanNovelsInfo",selectKoreanNovelsInfo);
		model.addAttribute("bookKoreanNovelsInfo6VO",bookKoreanNovelsInfo6VO);
		
		return "sample/book/bookKoreanNovelsList";
	}
	
	  @GetMapping("/syncbookKoreanNovelsForm") 
	  public String syncbookKoreanNovelsForm(Model model, BookKoreanNovelsInfo6VO  bookKoreanNovelsInfo6VO){
			
			  if (!StringUtils.isEmpty( bookKoreanNovelsInfo6VO.getBkIdx() )){ 
				  BookKoreanNovelsInfo6VO bookKoreanNovelsInfoSelectOne = bookKoreanNovelsInfo6Service.bookKoreanNovelsInfoSelectOne(bookKoreanNovelsInfo6VO);
			  model.addAttribute("bookKoreanNovelsInfo6VO", bookKoreanNovelsInfoSelectOne); }
	  return "sample/book/syncbookKoreanNovelsForm"; 
	  }
	 
	
	  @PostMapping("/syncBookKoreanNovelsFormSave") 
	  public String syncBookKoreanNovelsFormSave(Model  model, BookKoreanNovelsInfo6VO  bookKoreanNovelsInfo6VO, @RequestParam(value="action", required=true) String action){ 
		  if ( "insert".equals(action) ){ 
			  int insertCnt = bookKoreanNovelsInfo6Service.insertBookKoreanNovelsInfo(bookKoreanNovelsInfo6VO);
			  
		  }else if ( "update".equals(action) ){
			  int updateCnt = bookKoreanNovelsInfo6Service.updateBookKoreanNovelsInfo(bookKoreanNovelsInfo6VO);
		  }else if (
			  "delete".equals(action) ){ 
			  int deleteCnt = bookKoreanNovelsInfo6Service.deleteBookKoreanNovelsInfo(bookKoreanNovelsInfo6VO);
		  } 
		  return "redirect:bookKoreanNovelsList";
	  }
	 
}
