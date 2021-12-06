package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.OnedayClassArt53Mapper;
import com.cs.study.sample.vo.OnedayClassArt53VO;

@Service
public class OnedayClassArt53Service {
	
	public final OnedayClassArt53Mapper onedayClassArt53Mapper;
	public OnedayClassArt53Service(OnedayClassArt53Mapper onedayClassArt53Mapper) {
		this.onedayClassArt53Mapper = onedayClassArt53Mapper;
	}
	public OnedayClassArt53VO onedayClassArtSelectOne(OnedayClassArt53VO onedayClassArt53VO) {
		return onedayClassArt53Mapper.onedayClassArtSelectOne(onedayClassArt53VO);
	}
	public List<OnedayClassArt53VO> onedayClassArtList(OnedayClassArt53VO onedayClassArt53VO){
		return onedayClassArt53Mapper.onedayClassArtList(onedayClassArt53VO);
	}
	public int insertOnedayClassArt(OnedayClassArt53VO onedayClassArt53VO) {
		//체크박스 널일때 N으로 값넣기
		if(onedayClassArt53VO.getOcaClassStatus() == null) {
			onedayClassArt53VO.setOcaClassStatus("N");
		}
		return onedayClassArt53Mapper.insertOnedayClassArt(onedayClassArt53VO);
	}
	
	public int saveOnedayClassArt(OnedayClassArt53VO onedayClassArt53VO) {
		//체크박스 널일때 N으로 값넣기
		if(onedayClassArt53VO.getOcaClassStatus() == null) {
			onedayClassArt53VO.setOcaClassStatus("N");
		}
		return onedayClassArt53Mapper.saveOnedayClassArt(onedayClassArt53VO);
	} 
	
	public int updateOnedayClassArt(OnedayClassArt53VO onedayClassArt53VO) {
		//체크박스 널일때 N으로 값넣기
		if(onedayClassArt53VO.getOcaClassStatus() == null) {
			onedayClassArt53VO.setOcaClassStatus("N");
		}
		return onedayClassArt53Mapper.updateOnedayClassArt(onedayClassArt53VO);
	} 
	
	public int deleteOnedayClassArt(OnedayClassArt53VO onedayClassArt53VO) {
		return onedayClassArt53Mapper.deleteOnedayClassArt(onedayClassArt53VO);
	} 
}
