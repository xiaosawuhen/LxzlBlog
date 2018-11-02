package com.cn.db.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.db.bean.Company;
import com.cn.db.mapper.CompanyMapper;
import com.cn.db.service.CompanyService;

@Service("companyService")
public class CompanyServiceImpl implements CompanyService{
	
	@Autowired
	CompanyMapper companyMapper;
	
	public List<Company> select(Map<String, String> map) {
		return companyMapper.select(map);
	}

	@Transactional
	public Integer insertBatch(List<CompanyMapper> list) {
		return companyMapper.insertBatch(list);
	}
	
	@Transactional
	public Integer insert(Company company) {
		return companyMapper.insert(company);
	}
	
	@Transactional
	public Integer updateById(Company company) {
		return companyMapper.updateById(company);
	}
	
	@Transactional
	public Integer deleteById(Integer id) {
		return companyMapper.deleteById(list);
	}
}