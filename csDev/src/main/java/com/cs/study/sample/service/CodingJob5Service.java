package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.CodingJob5Mapper;
import com.cs.study.sample.vo.CodingInfo3VO;
import com.cs.study.sample.vo.CodingJob5VO;

@Service
public class CodingJob5Service {
	
	public final CodingJob5Mapper codingJob5Mapper;
	public CodingJob5Service(CodingJob5Mapper codingJob5Mapper) {
		this.codingJob5Mapper = codingJob5Mapper;
	}
	// 1�� ��ȸ
	public CodingJob5VO codingJobSelectOne(CodingJob5VO codingJob5VO) {
		return codingJob5Mapper.codingJobSelectOne(codingJob5VO);
	}
	public List<CodingJob5VO> codingJobList(CodingJob5VO codingJob5VO){
		return codingJob5Mapper.codingJobList(codingJob5VO);
	}
	public int insertCodingJob(CodingJob5VO codingJob5VO) {
		return codingJob5Mapper.insertCodingJob(codingJob5VO);
	} // ���
	
	public int savecodingInfo(CodingJob5VO codingJob5VO) {
		return codingJob5Mapper.saveCodingJob(codingJob5VO);
	} // ���� �� ���
	
	public int updateCodingJob(CodingJob5VO codingJob5VO) {
		return codingJob5Mapper.updateCodingJob(codingJob5VO);
	} // ����
	
	public int deleteCodingJob(CodingJob5VO codingJob5VO) {
		return codingJob5Mapper.deleteCodingJob(codingJob5VO);
	} // ����
}
