package com.lxzl.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Company;
import com.lxzl.db.dao.CompanyMapper;
import com.lxzl.db.dao.CompanyinfoMapper;
import com.lxzl.db.transfor.bean.CompanyBean;
import com.lxzl.service.CompanyService;

@Service("companyService")
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	CompanyMapper companyMapper;

	@Autowired
	CompanyinfoMapper companyinfoMapper;

	@Transactional
	public Integer insertBatch(List<Company> list) {
		return companyMapper.insertBatch(list);
	}

	@Transactional
	public Integer insert(Company company) {
		return null;
	}

	@Transactional
	public List<Company> select(Map<String, String> map) {
		return companyMapper.select(map);
	}

	public CompanyBean getInfoByName(String name) {
		return companyMapper.getInfoByName(name);
	}

	@Transactional
	public Integer insert(CompanyBean company) {
		Integer cnt = companyMapper.insert(company);
		if(cnt > 0) {
			Integer ciCnt = companyinfoMapper.insert(company);
			return ciCnt;
		}
		
		return 0;
	}

	public Integer updateById(CompanyBean company) {
		Integer cnt = companyMapper.updateById(company);
		if(cnt > 0) {
			Integer ciCnt = companyinfoMapper.updateById(company);
			return ciCnt;
		}
		
		return 0;
	}

	public CompanyBean selectById(Long id) {
		return companyMapper.selectById(id);
	}

	public Company selectByUserName(String username) {
		return companyMapper.selectByUserName(username);
	}

}
