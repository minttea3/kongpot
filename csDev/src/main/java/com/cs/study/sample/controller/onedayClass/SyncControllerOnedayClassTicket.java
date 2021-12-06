package com.cs.study.sample.controller.onedayClass;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.OnedayClassTicket56Service;
import com.cs.study.sample.vo.OnedayClassTicket56VO;

@Controller
public class SyncControllerOnedayClassTicket {

	
	  private final OnedayClassTicket56Service onedayClassTicket56Service;
	  
	  public SyncControllerOnedayClassTicket(OnedayClassTicket56Service onedayClassTicket56Service) { 
		  this.onedayClassTicket56Service = onedayClassTicket56Service;
	  }
	 
	@GetMapping("/onedayClassTicketList")
	public String onedayClassTicketList(Model model, OnedayClassTicket56VO  OnedayClassTicket56VO) {
		List<OnedayClassTicket56VO> onedayClassTicketList = onedayClassTicket56Service.onedayClassTicketList(OnedayClassTicket56VO);
		model.addAttribute("onedayClassTicketList", onedayClassTicketList);
		model.addAttribute("OnedayClassTicket56VO",OnedayClassTicket56VO);
		
		return "sample/onedayClass/onedayClassTicketList";
	}
	
	  @GetMapping("/syncOnedayClassTicketForm") 
	  public String syncAquariumfishInfoForm(Model model, OnedayClassTicket56VO  OnedayClassTicket56VO){
			
			  OnedayClassTicket56VO onedayClassTicketSelectOne = onedayClassTicket56Service.onedayClassTicketSelectOne(OnedayClassTicket56VO);
			  model.addAttribute("OnedayClassTicket56VO", onedayClassTicketSelectOne); 
			 
	  return "sample/onedayClass/syncOnedayClassTicketForm"; 
	  }
	 
	
	  @PostMapping("/syncOnedayClassTicketFormSave") 
	  public String syncAquariumfishInfoFormSave(Model  model, OnedayClassTicket56VO  OnedayClassTicket56VO, @RequestParam(value="action", required=true) String action){ 
		  if ( "insert".equals(action) ){ 
			  int insertCnt = onedayClassTicket56Service.insertOnedayClassTicket(OnedayClassTicket56VO);
			  
		  }else if ( "update".equals(action) ){
			  int updateCnt = onedayClassTicket56Service.updateOnedayClassTicket(OnedayClassTicket56VO);
		  }else if (
			  "delete".equals(action) ){ 
			  int deleteCnt = onedayClassTicket56Service.deleteOnedayClassTicket(OnedayClassTicket56VO);
		  } 
		  return "redirect:onedayClassTicketList";
	  }
	 
}
