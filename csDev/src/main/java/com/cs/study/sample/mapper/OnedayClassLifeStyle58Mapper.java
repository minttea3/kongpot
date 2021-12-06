package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.OnedayClassLifeStyle58VO;
@Mapper
public interface OnedayClassLifeStyle58Mapper {
	
	public OnedayClassLifeStyle58VO onedayClassLifeStyleSelectOne(OnedayClassLifeStyle58VO onedayClassLifeStyle58VO); 

	public List<OnedayClassLifeStyle58VO> onedayClassLifeStyleList(OnedayClassLifeStyle58VO onedayClassLifeStyle58VO);
	
	public int insertOnedayClassLifeStyle(OnedayClassLifeStyle58VO onedayClassLifeStyle58VO); 
	
	public int saveOnedayClassLifeStyle(OnedayClassLifeStyle58VO onedayClassLifeStyle58VO); 
	
	public int updateOnedayClassLifeStyle(OnedayClassLifeStyle58VO onedayClassLifeStyle58VO); 
	
	public int deleteOnedayClassLifeStyle(OnedayClassLifeStyle58VO onedayClassLifeStyle58VO);
}
