package com.cs.study.sample.controller.coding;

import com.cs.study.sample.service.CodingQnA2Service;
import com.cs.study.sample.service.SampleService;
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
public class SyncControllerCodingQnA {

	
	  private final CodingQnA2Service codingQnA2Service;
	  
	  public SyncControllerCodingQnA(CodingQnA2Service codingQnA2Service) { 
		  this.codingQnA2Service = codingQnA2Service;
	  }
	 
	@GetMapping("/codingQnAList")
	public String codingQnAList(Model model, CodingQnA2VO codingQnA2VO) {

		List<CodingQnA2VO> codingQuaList = codingQnA2Service.codingQuaList(codingQnA2VO);
		model.addAttribute("codingQuaList",codingQuaList);
		model.addAttribute("codingQnA2VO",codingQnA2VO);
		return "sample/coding/codingQnAList";
	}
	
	  @GetMapping("/syncCodingQnAForm") 
	  public String syncCodingQnAForm(Model model, CodingQnA2VO codingQnA2VO){
			
			  if (!StringUtils.isEmpty( codingQnA2VO.getCIdx() )){ 
			  CodingQnA2VO codingQuaSelectOne = codingQnA2Service.codingQuaSelectOne(codingQnA2VO);
			  model.addAttribute("codingQnA2VO", codingQuaSelectOne); }
	  return "sample/coding/syncCodingQnAForm"; 
	  }
	 
	
	  @PostMapping("syncCodingQnAFormSave") 
	  public String syncSampleFormSave(Model  model, CodingQnA2VO codingQnA2VO, @RequestParam(value="action", required=true) String action){ 
		  if ( "insert".equals(action) ){ 
			  int insertCnt = codingQnA2Service.insertcodingQua(codingQnA2VO);
			  
		  }else if ( "update".equals(action) ){
			  int updateCnt = codingQnA2Service.updatecodingQua(codingQnA2VO); 
		  }else if (
			  "delete".equals(action) ){ 
			  int deleteCnt = codingQnA2Service.deletecodingQua(codingQnA2VO); 
		  } 
		  return "redirect:codingQnAList";
	  }
	 
}
