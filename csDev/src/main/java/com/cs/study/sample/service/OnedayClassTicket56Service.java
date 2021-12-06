package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.OnedayClassTicket56Mapper;
import com.cs.study.sample.vo.OnedayClassTicket56VO;

@Service
public class OnedayClassTicket56Service {
	
	public final OnedayClassTicket56Mapper onedayClassTicket56Mapper;
	public OnedayClassTicket56Service(OnedayClassTicket56Mapper onedayClassTicket56Mapper) {
		this.onedayClassTicket56Mapper = onedayClassTicket56Mapper;
	}
	public OnedayClassTicket56VO onedayClassTicketSelectOne(OnedayClassTicket56VO onedayClassTicket56VO) {
		return onedayClassTicket56Mapper.onedayClassTicketSelectOne(onedayClassTicket56VO);
	}
	public List<OnedayClassTicket56VO> onedayClassTicketList(OnedayClassTicket56VO onedayClassTicket56VO){
		return onedayClassTicket56Mapper.onedayClassTicketList(onedayClassTicket56VO);
	}
	public int insertOnedayClassTicket(OnedayClassTicket56VO onedayClassTicket56VO) {
		// 체크박스 널일때 N처리
		if(onedayClassTicket56VO.getOctClassStatus() == null) {
			onedayClassTicket56VO.setOctClassStatus("N");
		}
		return onedayClassTicket56Mapper.insertOnedayClassTicket(onedayClassTicket56VO);
	}
	
	public int saveOnedayClassTicket(OnedayClassTicket56VO onedayClassTicket56VO) {
		// 체크박스 널일때 N처리
		if(onedayClassTicket56VO.getOctClassStatus() == null) {
			onedayClassTicket56VO.setOctClassStatus("N");
		}
		return onedayClassTicket56Mapper.saveOnedayClassTicket(onedayClassTicket56VO);
	} 
	
	public int updateOnedayClassTicket(OnedayClassTicket56VO onedayClassTicket56VO) {
		// 체크박스 널일때 N처리
		if(onedayClassTicket56VO.getOctClassStatus() == null) {
			onedayClassTicket56VO.setOctClassStatus("N");
		}
		return onedayClassTicket56Mapper.updateOnedayClassTicket(onedayClassTicket56VO);
	} 
	
	public int deleteOnedayClassTicket(OnedayClassTicket56VO onedayClassTicket56VO) {
		return onedayClassTicket56Mapper.deleteOnedayClassTicket(onedayClassTicket56VO);
	} 
}
