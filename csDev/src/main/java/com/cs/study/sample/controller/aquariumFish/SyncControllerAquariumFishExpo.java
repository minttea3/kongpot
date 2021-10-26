package com.cs.study.sample.controller.aquariumFish;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.AquariumfishExpo39Service;
import com.cs.study.sample.service.AquariumfishExpo39Service;
import com.cs.study.sample.vo.AquariumfishExpo39VO;
import com.cs.study.sample.vo.AquariumfishExpo39VO;

@Controller
public class SyncControllerAquariumFishExpo {

	
	  private final AquariumfishExpo39Service aquariumfishExpo39Service;
	  
	  public SyncControllerAquariumFishExpo(AquariumfishExpo39Service aquariumfishExpo39Service) { 
		  this.aquariumfishExpo39Service = aquariumfishExpo39Service;
	  }
	 
	@GetMapping("/aquariumfishExpoList")
	public String bookBestSellerInfoList(Model model, AquariumfishExpo39VO  aquariumfishExpo39VO) {
		List<AquariumfishExpo39VO> aquariumfishExpoList = aquariumfishExpo39Service.aquariumfishExpoList(aquariumfishExpo39VO);
		model.addAttribute("aquariumfishExpoList", aquariumfishExpoList);
		model.addAttribute("aquariumfishExpo39VO",aquariumfishExpo39VO);
		
		return "sample/aquariumfish/aquariumfishExpoList";
	}
	
	  @GetMapping("/syncAquariumfishExpoForm") 
	  public String syncBookBestSellerForm(Model model, AquariumfishExpo39VO  aquariumfishExpo39VO){
			
			  if (!StringUtils.isEmpty( aquariumfishExpo39VO.getAeIdx() )){ 
				  AquariumfishExpo39VO aquariumfishExpoSelectOne = aquariumfishExpo39Service.aquariumfishExpoSelectOne(aquariumfishExpo39VO);
			  model.addAttribute("aquariumfishExpo39VO", aquariumfishExpoSelectOne); 
			  }
	  return "sample/aquariumfish/syncAquariumfishExpoForm"; 
	  }
	 
	
	  @PostMapping("/syncAquariumfishExpoFormSave") 
	  public String syncBookBestsellerFormSave(Model  model, AquariumfishExpo39VO  aquariumfishExpo39VO, @RequestParam(value="action", required=true) String action){ 
		  if ( "insert".equals(action) ){ 
			  int insertCnt = aquariumfishExpo39Service.insertAquariumfishExpo(aquariumfishExpo39VO);
			  
		  }else if ( "update".equals(action) ){
			  int updateCnt = aquariumfishExpo39Service.updateAquariumfishExpo(aquariumfishExpo39VO);
		  }else if (
			  "delete".equals(action) ){ 
			  int deleteCnt = aquariumfishExpo39Service.deleteAquariumfishExpo(aquariumfishExpo39VO);
		  } 
		  return "redirect:aquariumfishExpoList";
	  }
	 
}
