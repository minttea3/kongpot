package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.OnedayClassMusic55VO;
@Mapper
public interface OnedayClassMusic55Mapper {
	
	public OnedayClassMusic55VO onedayClassMusicSelectOne(OnedayClassMusic55VO onedayClassMusic55VO); 

	public List<OnedayClassMusic55VO> onedayClassMusicList(OnedayClassMusic55VO onedayClassMusic55VO);
	
	public int insertOnedayClassMusic(OnedayClassMusic55VO onedayClassMusic55VO); 
	
	public int saveOnedayClassMusic(OnedayClassMusic55VO onedayClassMusic55VO); 
	
	public int updateOnedayClassMusic(OnedayClassMusic55VO onedayClassMusic55VO); 
	
	public int deleteOnedayClassMusic(OnedayClassMusic55VO onedayClassMusic55VO);
}
