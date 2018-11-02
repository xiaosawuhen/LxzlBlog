package com.cn.db.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.db.bean.Employeelevelinfo;
import com.cn.db.mapper.EmployeelevelinfoMapper;
import com.cn.db.service.EmployeelevelinfoService;

@Service("employeelevelinfoService")
public class EmployeelevelinfoServiceImpl implements EmployeelevelinfoService{
	
	@Autowired
	EmployeelevelinfoMapper employeelevelinfoMapper;
	
	public List<Employeelevelinfo> select(Map<String, String> map) {
		return employeelevelinfoMapper.select(map);
	}

	@Transactional
	public Integer insertBatch(List<EmployeelevelinfoMapper> list) {
		return employeelevelinfoMapper.insertBatch(list);
	}
	
	@Transactional
	public Integer insert(Employeelevelinfo employeelevelinfo) {
		return employeelevelinfoMapper.insert(employeelevelinfo);
	}
	
	@Transactional
	public Integer updateById(Employeelevelinfo employeelevelinfo) {
		return employeelevelinfoMapper.updateById(employeelevelinfo);
	}
	
	@Transactional
	public Integer deleteById(Integer id) {
		return employeelevelinfoMapper.deleteById(list);
	}
}