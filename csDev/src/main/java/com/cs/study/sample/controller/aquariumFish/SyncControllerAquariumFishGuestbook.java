package com.cs.study.sample.controller.aquariumFish;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.AquariumfishExpoGuestbook40Service;
import com.cs.study.sample.vo.AquariumfishExpoGuestbook40VO;

@Controller
public class SyncControllerAquariumFishGuestbook {

	
	  private final AquariumfishExpoGuestbook40Service aquariumfishExpoGuestbook40Service;
	  
	  public SyncControllerAquariumFishGuestbook(AquariumfishExpoGuestbook40Service aquariumfishExpoGuestbook40Service) { 
		  this.aquariumfishExpoGuestbook40Service = aquariumfishExpoGuestbook40Service;
	  }
	 
	@GetMapping("/aquariumfishExpoGuestbookList")
	public String bookBestSellerInfoList(Model model, AquariumfishExpoGuestbook40VO  aquariumfishExpoGuestbook40VO) {
		List<AquariumfishExpoGuestbook40VO> aquariumfishExpoGuestbookList = aquariumfishExpoGuestbook40Service.aquariumfishExpoGuestbookList(aquariumfishExpoGuestbook40VO);
		model.addAttribute("aquariumfishExpoGuestbookList", aquariumfishExpoGuestbookList);
		model.addAttribute("aquariumfishExpoGuestbook40VO",aquariumfishExpoGuestbook40VO);
		
		return "sample/aquariumfish/aquariumfishExpoGuestbookList";
	}
	
	  @GetMapping("/syncAquariumfishExpoGuestbookForm") 
	  public String syncBookBestSellerForm(Model model, AquariumfishExpoGuestbook40VO  aquariumfishExpoGuestbook40VO){
			
			  if (!StringUtils.isEmpty( aquariumfishExpoGuestbook40VO.getAebIdx() )){ 
				  AquariumfishExpoGuestbook40VO aquariumfishExpoGuestbookSelectOne = aquariumfishExpoGuestbook40Service.aquariumfishExpoGuestbookSelectOne(aquariumfishExpoGuestbook40VO);
			  model.addAttribute("aquariumfishExpoGuestbook40VO", aquariumfishExpoGuestbookSelectOne); 
			  }
	  return "sample/aquariumfish/syncAquariumfishExpoGuestbookForm"; 
	  }
	 
	
	  @PostMapping("/syncAquariumfishExpoGuestbookFormSave") 
	  public String syncBookBestsellerFormSave(Model  model, AquariumfishExpoGuestbook40VO  aquariumfishExpoGuestbook40VO, @RequestParam(value="action", required=true) String action){ 
		  if ( "insert".equals(action) ){ 
			  int insertCnt = aquariumfishExpoGuestbook40Service.insertAquariumfishExpo(aquariumfishExpoGuestbook40VO);
			  
		  }else if ( "update".equals(action) ){
			  int updateCnt = aquariumfishExpoGuestbook40Service.updateAquariumfishExpoGuestbook(aquariumfishExpoGuestbook40VO);
		  }else if (
			  "delete".equals(action) ){ 
			  int deleteCnt = aquariumfishExpoGuestbook40Service.deleteAquariumfishExpoGuestbook(aquariumfishExpoGuestbook40VO);
		  } 
		  return "redirect:aquariumfishExpoGuestbookList";
	  }
	 
}
