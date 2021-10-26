package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.AquariumfishStoreInfo42VO;
@Mapper
public interface AquariumfishStoreInfo42Mapper {
	
	public AquariumfishStoreInfo42VO aquariumfishStoreInfoSelectOne(AquariumfishStoreInfo42VO aquariumfishStoreInfo42VO); 

	public List<AquariumfishStoreInfo42VO> aquariumfishStoreInfoList(AquariumfishStoreInfo42VO aquariumfishStoreInfo42VO);
	
	public int insertAquariumfishStoreInfo(AquariumfishStoreInfo42VO aquariumfishStoreInfo42VO); 
	
	public int saveAquariumfishStoreInfo(AquariumfishStoreInfo42VO aquariumfishStoreInfo42VO); 
	
	public int updateAquariumfishStoreInfo(AquariumfishStoreInfo42VO aquariumfishStoreInfo42VO); 
	
	public int deleteAquariumfishStoreInfo(AquariumfishStoreInfo42VO aquariumfishStoreInfo42VO);
}
