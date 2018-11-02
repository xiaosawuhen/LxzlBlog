package com.cn.db.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.db.bean.Employeestatusinfo;
import com.cn.db.mapper.EmployeestatusinfoMapper;
import com.cn.db.service.EmployeestatusinfoService;

@Service("employeestatusinfoService")
public class EmployeestatusinfoServiceImpl implements EmployeestatusinfoService{
	
	@Autowired
	EmployeestatusinfoMapper employeestatusinfoMapper;
	
	public List<Employeestatusinfo> select(Map<String, String> map) {
		return employeestatusinfoMapper.select(map);
	}

	@Transactional
	public Integer insertBatch(List<EmployeestatusinfoMapper> list) {
		return employeestatusinfoMapper.insertBatch(list);
	}
	
	@Transactional
	public Integer insert(Employeestatusinfo employeestatusinfo) {
		return employeestatusinfoMapper.insert(employeestatusinfo);
	}
	
	@Transactional
	public Integer updateById(Employeestatusinfo employeestatusinfo) {
		return employeestatusinfoMapper.updateById(employeestatusinfo);
	}
	
	@Transactional
	public Integer deleteById(Integer id) {
		return employeestatusinfoMapper.deleteById(list);
	}
}