package com.cs.study.sample.controller.aquariumFish;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.AquariumfishNews41Service;
import com.cs.study.sample.vo.AquariumfishNews41VO;

@Controller
public class SyncControllerAquariumFishNews {

	
	  private final AquariumfishNews41Service aquariumfishNews41Service;
	  
	  public SyncControllerAquariumFishNews(AquariumfishNews41Service aquariumfishNews41Service) { 
		  this.aquariumfishNews41Service = aquariumfishNews41Service;
	  }
	 
	@GetMapping("/aquariumfishExpoNewsList")
	public String bookBestSellerInfoList(Model model, AquariumfishNews41VO  aquariumfishNews41VO) {
		List<AquariumfishNews41VO> aquariumfishNewsList = aquariumfishNews41Service.aquariumfishNewsList(aquariumfishNews41VO);
		model.addAttribute("aquariumfishNewsList", aquariumfishNewsList);
		model.addAttribute("aquariumfishNews41VO",aquariumfishNews41VO);
		
		return "sample/aquariumfish/aquariumfishExpoNewsList";
	}
	
	  @GetMapping("/syncAquariumfishExpoNewsForm") 
	  public String syncBookBestSellerForm(Model model, AquariumfishNews41VO  aquariumfishNews41VO){
			
			  if (!StringUtils.isEmpty( aquariumfishNews41VO.getAnIdx() )){ 
				  AquariumfishNews41VO aquariumfishNewsSelectOne = aquariumfishNews41Service.aquariumfishNewsSelectOne(aquariumfishNews41VO);
			  model.addAttribute("aquariumfishNews41VO", aquariumfishNewsSelectOne); 
			  }
	  return "sample/aquariumfish/syncAquariumfishExpoNewsForm"; 
	  }
	 
	
	  @PostMapping("/syncAquariumfishExpoNewsFormSave") 
	  public String syncBookBestsellerFormSave(Model  model, AquariumfishNews41VO  aquariumfishNews41VO, @RequestParam(value="action", required=true) String action){ 
		  if ( "insert".equals(action) ){ 
			  int insertCnt = aquariumfishNews41Service.insertAquariumfishNews(aquariumfishNews41VO);
			  
		  }else if ( "update".equals(action) ){
			  int updateCnt = aquariumfishNews41Service.updateAquariumfishExpo(aquariumfishNews41VO);
		  }else if (
			  "delete".equals(action) ){ 
			  int deleteCnt = aquariumfishNews41Service.deleteAquariumfishExpo(aquariumfishNews41VO);
		  } 
		  return "redirect:aquariumfishExpoNewsList";
	  }
	 
}
