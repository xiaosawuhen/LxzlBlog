package com.cn.db.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.db.bean.Companyinfo;
import com.cn.db.mapper.CompanyinfoMapper;
import com.cn.db.service.CompanyinfoService;

@Service("companyinfoService")
public class CompanyinfoServiceImpl implements CompanyinfoService{
	
	@Autowired
	CompanyinfoMapper companyinfoMapper;
	
	public List<Companyinfo> select(Map<String, String> map) {
		return companyinfoMapper.select(map);
	}

	@Transactional
	public Integer insertBatch(List<CompanyinfoMapper> list) {
		return companyinfoMapper.insertBatch(list);
	}
	
	@Transactional
	public Integer insert(Companyinfo companyinfo) {
		return companyinfoMapper.insert(companyinfo);
	}
	
	@Transactional
	public Integer updateById(Companyinfo companyinfo) {
		return companyinfoMapper.updateById(companyinfo);
	}
	
	@Transactional
	public Integer deleteById(Integer id) {
		return companyinfoMapper.deleteById(list);
	}
}