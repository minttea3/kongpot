package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.ClothesShoppingmallInfo60Mapper;
import com.cs.study.sample.mapper.ClothesShoppingmallInfo60Mapper;
import com.cs.study.sample.vo.ClothesShoppingmallinfo60VO;
import com.cs.study.sample.vo.ClothesShoppingmallinfo60VO;

@Service
public class ClothesShoppingmallInfo60Service {
	
	public final ClothesShoppingmallInfo60Mapper clothesShoppingmallInfo60Mapper;
	public ClothesShoppingmallInfo60Service(ClothesShoppingmallInfo60Mapper clothesShoppingmallInfo60Mapper) {
		this.clothesShoppingmallInfo60Mapper = clothesShoppingmallInfo60Mapper;
	}
	public ClothesShoppingmallinfo60VO clothesShoppingmallinfoSelectOne(ClothesShoppingmallinfo60VO clothesShoppingmallinfo60VO) {
		return clothesShoppingmallInfo60Mapper.clothesShoppingmallinfoSelectOne(clothesShoppingmallinfo60VO);
	}
	public List<ClothesShoppingmallinfo60VO> clothesShoppingmallinfoList(ClothesShoppingmallinfo60VO clothesShoppingmallinfo60VO){
		return clothesShoppingmallInfo60Mapper.clothesShoppingmallinfoList(clothesShoppingmallinfo60VO);
	}
	public int insertClothesShoppingmallinfo(ClothesShoppingmallinfo60VO clothesShoppingmallinfo60VO) {
		// 체크박스 널일때 N처리
		if(clothesShoppingmallinfo60VO.getCsiStoreStatus() == null) {
			clothesShoppingmallinfo60VO.setCsiStoreStatus("N");
		}
		return clothesShoppingmallInfo60Mapper.insertClothesShoppingmallinfo(clothesShoppingmallinfo60VO);
	}
	
	public int saveClothesShoppingmallinfo(ClothesShoppingmallinfo60VO clothesShoppingmallinfo60VO) {
		// 체크박스 널일때 N처리
		if(clothesShoppingmallinfo60VO.getCsiStoreStatus() == null) {
			clothesShoppingmallinfo60VO.setCsiStoreStatus("N");
		}
		return clothesShoppingmallInfo60Mapper.saveClothesShoppingmallinfo(clothesShoppingmallinfo60VO);
	} 
	
	public int updateClothesShoppingmallinfo(ClothesShoppingmallinfo60VO clothesShoppingmallinfo60VO) {
		// 체크박스 널일때 N처리
		if(clothesShoppingmallinfo60VO.getCsiStoreStatus() == null) {
			clothesShoppingmallinfo60VO.setCsiStoreStatus("N");
		}
		return clothesShoppingmallInfo60Mapper.updateClothesShoppingmallinfo(clothesShoppingmallinfo60VO);
	} 
	
	public int deleteClothesShoppingmallinfo(ClothesShoppingmallinfo60VO clothesShoppingmallinfo60VO) {
		return clothesShoppingmallInfo60Mapper.deleteClothesShoppingmallinfo(clothesShoppingmallinfo60VO);
	} 
}
