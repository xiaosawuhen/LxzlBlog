package com.cn.db.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.db.bean.Employeeinfo;
import com.cn.db.mapper.EmployeeinfoMapper;
import com.cn.db.service.EmployeeinfoService;

@Service("employeeinfoService")
public class EmployeeinfoServiceImpl implements EmployeeinfoService{
	
	@Autowired
	EmployeeinfoMapper employeeinfoMapper;
	
	public List<Employeeinfo> select(Map<String, String> map) {
		return employeeinfoMapper.select(map);
	}

	@Transactional
	public Integer insertBatch(List<EmployeeinfoMapper> list) {
		return employeeinfoMapper.insertBatch(list);
	}
	
	@Transactional
	public Integer insert(Employeeinfo employeeinfo) {
		return employeeinfoMapper.insert(employeeinfo);
	}
	
	@Transactional
	public Integer updateById(Employeeinfo employeeinfo) {
		return employeeinfoMapper.updateById(employeeinfo);
	}
	
	@Transactional
	public Integer deleteById(Integer id) {
		return employeeinfoMapper.deleteById(list);
	}
}