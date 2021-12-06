package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.OnedayClassBeauty54Mapper;
import com.cs.study.sample.vo.OnedayClassBeauty54VO;

@Service
public class OnedayClassBeauty54Service {
	
	public final OnedayClassBeauty54Mapper onedayClassBeauty54Mapper;
	public OnedayClassBeauty54Service(OnedayClassBeauty54Mapper onedayClassBeauty54Mapper) {
		this.onedayClassBeauty54Mapper = onedayClassBeauty54Mapper;
	}
	public OnedayClassBeauty54VO onedayClassBeautySelectOne(OnedayClassBeauty54VO onedayClassBeauty54VO) {
		return onedayClassBeauty54Mapper.onedayClassBeautySelectOne(onedayClassBeauty54VO);
	}
	public List<OnedayClassBeauty54VO> onedayClassBeautyList(OnedayClassBeauty54VO onedayClassBeauty54VO){
		return onedayClassBeauty54Mapper.onedayClassBeautyList(onedayClassBeauty54VO);
	}
	public int insertOnedayClassBeauty(OnedayClassBeauty54VO onedayClassBeauty54VO) {
		// 체크박스 널일때 N처리
		if(onedayClassBeauty54VO.getOcbeClassStatus() == null) {
			onedayClassBeauty54VO.setOcbeClassStatus("N");
		}
		return onedayClassBeauty54Mapper.insertOnedayClassBeauty(onedayClassBeauty54VO);
	}
	
	public int saveOnedayClassBeauty(OnedayClassBeauty54VO onedayClassBeauty54VO) {
		// 체크박스 널일때 N처리
		if(onedayClassBeauty54VO.getOcbeClassStatus() == null) {
			onedayClassBeauty54VO.setOcbeClassStatus("N");
		}
		return onedayClassBeauty54Mapper.saveOnedayClassBeauty(onedayClassBeauty54VO);
	} 
	
	public int updateOnedayClassBeauty(OnedayClassBeauty54VO onedayClassBeauty54VO) {
		// 체크박스 널일때 N처리
		if(onedayClassBeauty54VO.getOcbeClassStatus() == null) {
			onedayClassBeauty54VO.setOcbeClassStatus("N");
		}
		return onedayClassBeauty54Mapper.updateOnedayClassBeauty(onedayClassBeauty54VO);
	} 
	
	public int deleteOnedayClassBeauty(OnedayClassBeauty54VO onedayClassBeauty54VO) {
		return onedayClassBeauty54Mapper.deleteOnedayClassBeauty(onedayClassBeauty54VO);
	} 
}
