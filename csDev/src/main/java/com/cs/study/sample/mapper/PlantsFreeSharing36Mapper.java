package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.PlantsFreeSharing36VO;
@Mapper
public interface PlantsFreeSharing36Mapper {
	
	public PlantsFreeSharing36VO plantsFreeSharingSelectOne(PlantsFreeSharing36VO plantsFreeSharing36VO); 

	public List<PlantsFreeSharing36VO> plantsFreeSharingList(PlantsFreeSharing36VO plantsFreeSharing36VO);
	
	public int insertPlantsFreeSharing(PlantsFreeSharing36VO plantsFreeSharing36VO); 
	
	public int savePlantsFreeSharing(PlantsFreeSharing36VO plantsFreeSharing36VO); 
	
	public int updatePlantsFreeSharing(PlantsFreeSharing36VO plantsFreeSharing36VO); 
	
	public int deletePlantsFreeSharing(PlantsFreeSharing36VO plantsFreeSharing36VO);
}
