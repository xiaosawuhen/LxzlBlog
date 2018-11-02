package com.cn.db.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.db.bean.Employeestatus;
import com.cn.db.mapper.EmployeestatusMapper;
import com.cn.db.service.EmployeestatusService;

@Service("employeestatusService")
public class EmployeestatusServiceImpl implements EmployeestatusService{
	
	@Autowired
	EmployeestatusMapper employeestatusMapper;
	
	public List<Employeestatus> select(Map<String, String> map) {
		return employeestatusMapper.select(map);
	}

	@Transactional
	public Integer insertBatch(List<EmployeestatusMapper> list) {
		return employeestatusMapper.insertBatch(list);
	}
	
	@Transactional
	public Integer insert(Employeestatus employeestatus) {
		return employeestatusMapper.insert(employeestatus);
	}
	
	@Transactional
	public Integer updateById(Employeestatus employeestatus) {
		return employeestatusMapper.updateById(employeestatus);
	}
	
	@Transactional
	public Integer deleteById(Integer id) {
		return employeestatusMapper.deleteById(list);
	}
}