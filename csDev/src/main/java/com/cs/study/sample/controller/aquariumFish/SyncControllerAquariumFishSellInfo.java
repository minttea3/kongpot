package com.cs.study.sample.controller.aquariumFish;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.AquariumfishInfo37Service;
import com.cs.study.sample.service.AquariumfishSellInfo43Service;
import com.cs.study.sample.vo.AquariumfishSellInfo43VO;
import com.cs.study.sample.vo.AquariumfishSellInfo43VO;

@Controller
public class SyncControllerAquariumFishSellInfo {

	
	  private final AquariumfishSellInfo43Service aquariumfishSellInfo43Service;
	  
	  public SyncControllerAquariumFishSellInfo(AquariumfishSellInfo43Service aquariumfishSellInfo43Service) { 
		  this.aquariumfishSellInfo43Service = aquariumfishSellInfo43Service;
	  }
	 
	@GetMapping("/aquariumfishSellInfoList")
	public String aquariumfishSellInfoList(Model model, AquariumfishSellInfo43VO  aquariumfishSellInfo43VO) {
		List<AquariumfishSellInfo43VO> aquariumfishSellInfoList = aquariumfishSellInfo43Service.aquariumfishSellInfoList(aquariumfishSellInfo43VO);
		model.addAttribute("aquariumfishSellInfoList", aquariumfishSellInfoList);
		model.addAttribute("aquariumfishSellInfo43VO",aquariumfishSellInfo43VO);
		
		return "sample/aquariumfish/aquariumfishSellInfoList";
	}
	
	  @GetMapping("/syncAquariumfishSellInfoForm") 
	  public String syncAquariumfishInfoForm(Model model, AquariumfishSellInfo43VO  aquariumfishSellInfo43VO){
			
			  if (!StringUtils.isEmpty( aquariumfishSellInfo43VO.getAsiiIdx() )){ 
				  AquariumfishSellInfo43VO aquariumfishSellInfoSelectOne = aquariumfishSellInfo43Service.aquariumfishSellInfoSelectOne(aquariumfishSellInfo43VO);
			  model.addAttribute("aquariumfishSellInfo43VO", aquariumfishSellInfoSelectOne); 
			  }
	  return "sample/aquariumfish/syncAquariumfishSellInfoForm"; 
	  }
	 
	
	  @PostMapping("/syncAquariumfishSellInfoFormSave") 
	  public String syncAquariumfishInfoFormSave(Model  model, AquariumfishSellInfo43VO  aquariumfishSellInfo43VO, @RequestParam(value="action", required=true) String action){ 
		  if ( "insert".equals(action) ){ 
			  int insertCnt = aquariumfishSellInfo43Service.insertAquariumfishSellInfo(aquariumfishSellInfo43VO);
			  
		  }else if ( "update".equals(action) ){
			  int updateCnt = aquariumfishSellInfo43Service.updateAquariumfishSellInfo(aquariumfishSellInfo43VO);
		  }else if (
			  "delete".equals(action) ){ 
			  int deleteCnt = aquariumfishSellInfo43Service.deleteAquariumfishSellInfo(aquariumfishSellInfo43VO);
		  } 
		  return "redirect:aquariumfishSellInfoList";
	  }
	 
}
