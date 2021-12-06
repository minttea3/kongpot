package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.OnedayClassMember50Mapper;
import com.cs.study.sample.vo.OnedayClassMember50VO;

@Service
public class OnedayClassMember50Service {
	
	public final OnedayClassMember50Mapper onedayClassMember50Mapper;
	public OnedayClassMember50Service(OnedayClassMember50Mapper onedayClassMember50Mapper) {
		this.onedayClassMember50Mapper = onedayClassMember50Mapper;
	}
	public OnedayClassMember50VO onedayClassMemberSelectOne(OnedayClassMember50VO onedayClassMember50VO) {
		return onedayClassMember50Mapper.onedayClassMemberSelectOne(onedayClassMember50VO);
	}
	public List<OnedayClassMember50VO> onedayClassMemberList(OnedayClassMember50VO onedayClassMember50VO){
		return onedayClassMember50Mapper.onedayClassMemberList(onedayClassMember50VO);
	}
	public int insertOnedayClassMember(OnedayClassMember50VO onedayClassMember50VO) {
		//체크 박스 null일때 N으로 변경
		if(onedayClassMember50VO.getOcmTermsinfoYn() == null) {
			onedayClassMember50VO.setOcmTermsinfoYn("N");
		}
		return onedayClassMember50Mapper.insertOnedayClassMember(onedayClassMember50VO);
	}
	
	public int saveOnedayClassMember(OnedayClassMember50VO onedayClassMember50VO) {
		if(onedayClassMember50VO.getOcmTermsinfoYn() == null) {
			onedayClassMember50VO.setOcmTermsinfoYn("N");
		}
		return onedayClassMember50Mapper.saveOnedayClassMember(onedayClassMember50VO);
	} 
	
	public int updateOnedayClassMember(OnedayClassMember50VO onedayClassMember50VO) {
		if(onedayClassMember50VO.getOcmTermsinfoYn() == null) {
			onedayClassMember50VO.setOcmTermsinfoYn("N");
		}
		return onedayClassMember50Mapper.updateOnedayClassMember(onedayClassMember50VO);
	} 
	
	public int deleteOnedayClassMember(OnedayClassMember50VO onedayClassMember50VO) {
		return onedayClassMember50Mapper.deleteOnedayClassMember(onedayClassMember50VO);
	} 
}
