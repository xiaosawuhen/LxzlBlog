package com.cn.db.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.db.bean.Companyemployeeinfo;
import com.cn.db.mapper.CompanyemployeeinfoMapper;
import com.cn.db.service.CompanyemployeeinfoService;

@Service("companyemployeeinfoService")
public class CompanyemployeeinfoServiceImpl implements CompanyemployeeinfoService{
	
	@Autowired
	CompanyemployeeinfoMapper companyemployeeinfoMapper;
	
	public List<Companyemployeeinfo> select(Map<String, String> map) {
		return companyemployeeinfoMapper.select(map);
	}

	@Transactional
	public Integer insertBatch(List<CompanyemployeeinfoMapper> list) {
		return companyemployeeinfoMapper.insertBatch(list);
	}
	
	@Transactional
	public Integer insert(Companyemployeeinfo companyemployeeinfo) {
		return companyemployeeinfoMapper.insert(companyemployeeinfo);
	}
	
	@Transactional
	public Integer updateById(Companyemployeeinfo companyemployeeinfo) {
		return companyemployeeinfoMapper.updateById(companyemployeeinfo);
	}
	
	@Transactional
	public Integer deleteById(Integer id) {
		return companyemployeeinfoMapper.deleteById(list);
	}
}