package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.OnedayClassMusic55Mapper;
import com.cs.study.sample.vo.OnedayClassMusic55VO;

@Service
public class OnedayClassMusic55Service {
	
	public final OnedayClassMusic55Mapper onedayClassMusic55Mapper;
	public OnedayClassMusic55Service(OnedayClassMusic55Mapper onedayClassMusic55Mapper) {
		this.onedayClassMusic55Mapper = onedayClassMusic55Mapper;
	}
	public OnedayClassMusic55VO onedayClassMusicSelectOne(OnedayClassMusic55VO onedayClassMusic55VO) {
		return onedayClassMusic55Mapper.onedayClassMusicSelectOne(onedayClassMusic55VO);
	}
	public List<OnedayClassMusic55VO> onedayClassMusicList(OnedayClassMusic55VO onedayClassMusic55VO){
		return onedayClassMusic55Mapper.onedayClassMusicList(onedayClassMusic55VO);
	}
	public int insertOnedayClassMusic(OnedayClassMusic55VO onedayClassMusic55VO) {
		// 체크박스 널일때 N처리
		if(onedayClassMusic55VO.getOcmClassStatus() == null) {
			onedayClassMusic55VO.setOcmClassStatus("N");
		}
		return onedayClassMusic55Mapper.insertOnedayClassMusic(onedayClassMusic55VO);
	}
	
	public int saveOnedayClassMusic(OnedayClassMusic55VO onedayClassMusic55VO) {
		// 체크박스 널일때 N처리
		if(onedayClassMusic55VO.getOcmClassStatus() == null) {
			onedayClassMusic55VO.setOcmClassStatus("N");
		}
		return onedayClassMusic55Mapper.saveOnedayClassMusic(onedayClassMusic55VO);
	} 
	
	public int updateOnedayClassMusic(OnedayClassMusic55VO onedayClassMusic55VO) {
		// 체크박스 널일때 N처리
		if(onedayClassMusic55VO.getOcmClassStatus() == null) {
			onedayClassMusic55VO.setOcmClassStatus("N");
		}
		return onedayClassMusic55Mapper.updateOnedayClassMusic(onedayClassMusic55VO);
	} 
	
	public int deleteOnedayClassMusic(OnedayClassMusic55VO onedayClassMusic55VO) {
		return onedayClassMusic55Mapper.deleteOnedayClassMusic(onedayClassMusic55VO);
	} 
}
