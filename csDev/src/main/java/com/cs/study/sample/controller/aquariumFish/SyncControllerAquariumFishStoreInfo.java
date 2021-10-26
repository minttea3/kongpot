package com.cs.study.sample.controller.aquariumFish;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.AquariumfishExpo39Service;
import com.cs.study.sample.service.AquariumfishStoreInfo42Service;
import com.cs.study.sample.service.AquariumfishExpo39Service;
import com.cs.study.sample.vo.AquariumfishStoreInfo42VO;
import com.cs.study.sample.vo.AquariumfishStoreInfo42VO;
import com.cs.study.sample.vo.AquariumfishStoreInfo42VO;

@Controller
public class SyncControllerAquariumFishStoreInfo {

	
	  private final AquariumfishStoreInfo42Service aquariumfishStoreInfo42Service;
	  
	  public SyncControllerAquariumFishStoreInfo(AquariumfishStoreInfo42Service aquariumfishStoreInfo42Service) { 
		  this.aquariumfishStoreInfo42Service = aquariumfishStoreInfo42Service;
	  }
	 
	@GetMapping("/aquariumfishStoreInfoList")
	public String bookBestSellerInfoList(Model model, AquariumfishStoreInfo42VO  aquariumfishStoreInfo42VO) {
		List<AquariumfishStoreInfo42VO> aquariumfishStoreInfoList = aquariumfishStoreInfo42Service.aquariumfishStoreInfoList(aquariumfishStoreInfo42VO);
		model.addAttribute("aquariumfishStoreInfoList", aquariumfishStoreInfoList);
		model.addAttribute("aquariumfishStoreInfo42VO",aquariumfishStoreInfo42VO);
		
		return "sample/aquariumfish/aquariumfishStoreInfoList";
	}
	
	  @GetMapping("/syncAquariumfishStoreInfoForm") 
	  public String syncBookBestSellerForm(Model model, AquariumfishStoreInfo42VO  aquariumfishStoreInfo42VO){
			
			  if (!StringUtils.isEmpty( aquariumfishStoreInfo42VO.getAsiIdx() )){ 
				  AquariumfishStoreInfo42VO aquariumfishStoreInfoSelectOne = aquariumfishStoreInfo42Service.aquariumfishStoreInfoSelectOne(aquariumfishStoreInfo42VO);
			  model.addAttribute("aquariumfishStoreInfo42VO", aquariumfishStoreInfoSelectOne); 
			  }
	  return "sample/aquariumfish/syncAquariumfishStoreInfoForm"; 
	  }
	 
	
	  @PostMapping("/syncAquariumfishStoreInfoFormSave") 
	  public String syncBookBestsellerFormSave(Model  model, AquariumfishStoreInfo42VO  aquariumfishStoreInfo42VO, @RequestParam(value="action", required=true) String action){ 
		  if ( "insert".equals(action) ){ 
			  int insertCnt = aquariumfishStoreInfo42Service.insertAquariumfishStoreInfo(aquariumfishStoreInfo42VO);
			  
		  }else if ( "update".equals(action) ){
			  int updateCnt = aquariumfishStoreInfo42Service.updateAquariumfishStoreInfo(aquariumfishStoreInfo42VO);
		  }else if (
			  "delete".equals(action) ){ 
			  int deleteCnt = aquariumfishStoreInfo42Service.deleteAquariumfishStoreInfo(aquariumfishStoreInfo42VO);
		  } 
		  return "redirect:aquariumfishStoreInfoList";
	  }
	 
}
