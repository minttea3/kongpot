package com.cs.study.sample.controller.coding;

import com.cs.study.sample.service.CodingInfo3Service;
import com.cs.study.sample.service.SampleService;
import com.cs.study.sample.vo.CodingInfo3VO;
import com.cs.study.sample.vo.CodingQnA2VO;
import com.cs.study.sample.vo.SampleVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SyncControllerCodingInfo {

	
	  private final CodingInfo3Service codingInfo3Service;
	  
	  public SyncControllerCodingInfo(CodingInfo3Service codingInfo3Service) { 
		  this.codingInfo3Service = codingInfo3Service; 
	  }
	 
	@GetMapping("/codingInfoList")
	public String syncSampleList(Model model, CodingInfo3VO codingInfo3VO) {

		List<CodingInfo3VO> codingInfoList = codingInfo3Service.codingInfoList(codingInfo3VO);
		model.addAttribute("codingInfoList", codingInfoList);
		model.addAttribute("codingQnA2VO", codingInfo3VO);
		return "sample/coding/codingInfoList";
	}
	@GetMapping("/syncCodingInfoForm")
	public String syncCodingInfoForm(Model model, CodingInfo3VO codingInfo3VO){
		
		  if (!StringUtils.isEmpty( codingInfo3VO.getCiIdx() )){ 
		  CodingInfo3VO codingInfoSelectOne = codingInfo3Service.codingQuaSelectOne(codingInfo3VO);
		  model.addAttribute("codingInfo3VO", codingInfoSelectOne); }
		  return "sample/coding/syncCodingInfoForm"; 
	}
	
	
	
	  @PostMapping("syncCodingInfoFormSave") 
	  public String syncSampleFormSave(Model model, CodingInfo3VO codingInfo3VO, @RequestParam(value="action", required=true) String action){ 
		  if ( "insert".equals(action) ){
			  int insertCnt =codingInfo3Service.insertcodingInfo(codingInfo3VO);
		  }else if ( "update".equals(action) ){
			  int updateCnt = codingInfo3Service.updatecodingInfo(codingInfo3VO);
		  }else if ("delete".equals(action) ){
			  int deleteCnt = codingInfo3Service.deletecodingInfo(codingInfo3VO);
		  } 
		  return "redirect:codingInfoList";
	  }
	 
}
