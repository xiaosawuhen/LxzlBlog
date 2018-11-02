package com.lxzl.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Employeestatus;
import com.lxzl.db.dao.EmployeestatusMapper;
import com.lxzl.service.EmployeestatusService;

@Service("employeestatusService")
public class EmployeestatusServiceImpl implements EmployeestatusService {

	@Autowired
	EmployeestatusMapper employeestatusMapper;

	@Transactional
	public Integer insertBatch(List<Employeestatus> list) {
		return employeestatusMapper.insertBatch(list);
	}

	@Transactional
	public Integer insert(Employeestatus employeestatus) {
		return employeestatusMapper.insert(employeestatus);
	}

	@Transactional
	public List<Employeestatus> select(Map<String, String> map) {
		return employeestatusMapper.select(map);
	}

}
