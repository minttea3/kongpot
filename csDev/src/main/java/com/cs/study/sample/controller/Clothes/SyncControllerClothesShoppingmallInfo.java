package com.cs.study.sample.controller.Clothes;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.ClothesShoppingmallInfo60Service;
import com.cs.study.sample.vo.ClothesShoppingmallinfo60VO;

@Controller
public class SyncControllerClothesShoppingmallInfo {

	
	  private final ClothesShoppingmallInfo60Service clothesShoppingmallInfo60Service;
	  
	  public SyncControllerClothesShoppingmallInfo(ClothesShoppingmallInfo60Service clothesShoppingmallInfo60Service) { 
		  this.clothesShoppingmallInfo60Service = clothesShoppingmallInfo60Service;
	  }
	 
	@GetMapping("/clothesShoppingmallinfoList")
	public String bookForeignNovelsList(Model model, ClothesShoppingmallinfo60VO  clothesShoppingmallinfo60VO) {
		List<ClothesShoppingmallinfo60VO> clothesShoppingmallinfoList = clothesShoppingmallInfo60Service.clothesShoppingmallinfoList(clothesShoppingmallinfo60VO);
		model.addAttribute("clothesShoppingmallinfoList",clothesShoppingmallinfoList);
		model.addAttribute("clothesShoppingmallinfo60VO",clothesShoppingmallinfo60VO);
		
		return "sample/clothes/clothesShoppingmallinfoList";
	}
	
	  @GetMapping("/syncClothesShoppingmallinfoForm") 
	  public String syncbookForeignNovelsForm(Model model, ClothesShoppingmallinfo60VO  clothesShoppingmallinfo60VO){
			
				  ClothesShoppingmallinfo60VO clothesShoppingmallinfoSelectOne = clothesShoppingmallInfo60Service.clothesShoppingmallinfoSelectOne(clothesShoppingmallinfo60VO);
			  model.addAttribute("clothesShoppingmallinfo60VO", clothesShoppingmallinfoSelectOne); 
	  return "sample/clothes/syncClothesShoppingmallinfoForm"; 
	  }
	 
	
	  @PostMapping("/syncClothesShoppingmallinfoFormSave") 
	  public String syncBookForeignNovelsFormSave(Model  model, ClothesShoppingmallinfo60VO  clothesShoppingmallinfo60VO, @RequestParam(value="action", required=true) String action){ 
		  if ( "insert".equals(action) ){ 
			  int insertCnt = clothesShoppingmallInfo60Service.insertClothesShoppingmallinfo(clothesShoppingmallinfo60VO);
			  
		  }else if ( "update".equals(action) ){
			  int updateCnt = clothesShoppingmallInfo60Service.updateClothesShoppingmallinfo(clothesShoppingmallinfo60VO);
		  }else if (
			  "delete".equals(action) ){ 
			  int deleteCnt = clothesShoppingmallInfo60Service.deleteClothesShoppingmallinfo(clothesShoppingmallinfo60VO);
		  } 
		  return "redirect:clothesShoppingmallinfoList";
	  }
	 
}
