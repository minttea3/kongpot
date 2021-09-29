package com.cs.study.sample.controller.coding;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.CodingCommunity4Service;
import com.cs.study.sample.vo.CodingCommunity4VO;
import com.cs.study.sample.vo.CodingQnA2VO;

@Controller
public class SyncControllerCodingCommunity {

	
	  private final CodingCommunity4Service codingCommunity4Service;
	  
	  public SyncControllerCodingCommunity(CodingCommunity4Service codingCommunity4Service) { 
		  this.codingCommunity4Service = codingCommunity4Service;
	  }
	 
	@GetMapping("/codingCommunityList")
	public String codingQnAList(Model model, CodingCommunity4VO codingCommunity4VO) {
		List<CodingCommunity4VO> selectCodingCommunityList = codingCommunity4Service.codingCommunityList(codingCommunity4VO);
		model.addAttribute("selectCodingCommunityList", selectCodingCommunityList);
		model.addAttribute("codingCommunity4VO", codingCommunity4VO);
		
		return "sample/coding/codingCommunityList";
	}
	
	  @GetMapping("/syncCodingCommunityForm") 
	  public String syncCodingCommunutyForm(Model model, CodingCommunity4VO codingCommunity4VO){
			
			  if (!StringUtils.isEmpty( codingCommunity4VO.getCcIdx() )){ 
				  CodingCommunity4VO codingQuaSelectOne = codingCommunity4Service.codingCommunitySelectOne(codingCommunity4VO);
			  model.addAttribute("codingCommunity4VO", codingQuaSelectOne);
			  }
	  return "sample/coding/syncCodingCommunityForm"; 
	  }
	 
	
	  @PostMapping("/syncCodingCommunityFormSave") 
	  public String syncCodingCommunityFormSave(Model  model, CodingCommunity4VO codingCommunity4VO, @RequestParam(value="action", required=true) String action){ 
		  if ( "insert".equals(action) ){ 
			  int insertCnt = codingCommunity4Service.insertcodingInfo(codingCommunity4VO);
			  
		  }else if ( "update".equals(action) ){
			  int updateCnt = codingCommunity4Service.updatecodingInfo(codingCommunity4VO);
		  }else if (
			  "delete".equals(action) ){ 
			  int deleteCnt = codingCommunity4Service.deletecodingInfo(codingCommunity4VO);
		  } 
		  return "redirect:codingCommunityList";
	  }
	 
}
