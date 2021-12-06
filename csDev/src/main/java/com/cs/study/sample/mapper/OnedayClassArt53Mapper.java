package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.OnedayClassArt53VO;
@Mapper
public interface OnedayClassArt53Mapper {
	
	public OnedayClassArt53VO onedayClassArtSelectOne(OnedayClassArt53VO onedayClassArt53VO); 

	public List<OnedayClassArt53VO> onedayClassArtList(OnedayClassArt53VO onedayClassArt53VO);
	
	public int insertOnedayClassArt(OnedayClassArt53VO onedayClassArt53VO); 
	
	public int saveOnedayClassArt(OnedayClassArt53VO onedayClassArt53VO); 
	
	public int updateOnedayClassArt(OnedayClassArt53VO onedayClassArt53VO); 
	
	public int deleteOnedayClassArt(OnedayClassArt53VO onedayClassArt53VO);
}
