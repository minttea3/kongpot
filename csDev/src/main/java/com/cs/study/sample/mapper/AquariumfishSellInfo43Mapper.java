package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.AquariumfishSellInfo43VO;
@Mapper
public interface AquariumfishSellInfo43Mapper {
	
	public AquariumfishSellInfo43VO aquariumfishSellInfoSelectOne(AquariumfishSellInfo43VO aquariumfishSellInfo43VO); 

	public List<AquariumfishSellInfo43VO> aquariumfishSellInfoList(AquariumfishSellInfo43VO aquariumfishSellInfo43VO);
	
	public int insertAquariumfishSellInfo(AquariumfishSellInfo43VO aquariumfishSellInfo43VO); 
	
	public int saveAquariumfishSellInfo(AquariumfishSellInfo43VO aquariumfishSellInfo43VO); 
	
	public int updateAquariumfishSellInfo(AquariumfishSellInfo43VO aquariumfishSellInfo43VO); 
	
	public int deleteAquariumfishSellInfo(AquariumfishSellInfo43VO aquariumfishSellInfo43VO);
}
