package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.OnedayClassInfo49VO;
@Mapper
public interface OnedayClassInfo49Mapper {
	
	public OnedayClassInfo49VO onedayClassInfoSelectOne(OnedayClassInfo49VO onedayClassInfo49VO); 

	public List<OnedayClassInfo49VO> onedayClassInfoList(OnedayClassInfo49VO onedayClassInfo49VO);
	
	public int insertOnedayClassInfo(OnedayClassInfo49VO onedayClassInfo49VO); 
	
	public int saveOnedayClassInfo(OnedayClassInfo49VO onedayClassInfo49VO); 
	
	public int updateOnedayClassInfo(OnedayClassInfo49VO onedayClassInfo49VO); 
	
	public int deleteOnedayClassInfo(OnedayClassInfo49VO onedayClassInfo49VO);
}
