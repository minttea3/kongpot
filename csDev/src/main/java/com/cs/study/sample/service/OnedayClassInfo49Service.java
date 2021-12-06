package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.OnedayClassInfo49Mapper;
import com.cs.study.sample.vo.OnedayClassInfo49VO;

@Service
public class OnedayClassInfo49Service {
	
	public final OnedayClassInfo49Mapper onedayClassInfo49Mapper;
	public OnedayClassInfo49Service(OnedayClassInfo49Mapper onedayClassInfo49Mapper) {
		this.onedayClassInfo49Mapper = onedayClassInfo49Mapper;
	}
	public OnedayClassInfo49VO onedayClassInfoSelectOne(OnedayClassInfo49VO onedayClassInfo49VO) {
		return onedayClassInfo49Mapper.onedayClassInfoSelectOne(onedayClassInfo49VO);
	}
	public List<OnedayClassInfo49VO> onedayClassInfoList(OnedayClassInfo49VO onedayClassInfo49VO){
		return onedayClassInfo49Mapper.onedayClassInfoList(onedayClassInfo49VO);
	}
	public int insertOnedayClassInfo(OnedayClassInfo49VO onedayClassInfo49VO) {
	
		return onedayClassInfo49Mapper.insertOnedayClassInfo(onedayClassInfo49VO);
	}
	
	public int saveOnedayClassInfo(OnedayClassInfo49VO onedayClassInfo49VO) {
		return onedayClassInfo49Mapper.saveOnedayClassInfo(onedayClassInfo49VO);
	} 
	
	public int updateOnedayClassInfo(OnedayClassInfo49VO onedayClassInfo49VO) {
		
		return onedayClassInfo49Mapper.updateOnedayClassInfo(onedayClassInfo49VO);
	} 
	
	public int deleteOnedayClassInfo(OnedayClassInfo49VO onedayClassInfo49VO) {
		return onedayClassInfo49Mapper.deleteOnedayClassInfo(onedayClassInfo49VO);
	} 
}
