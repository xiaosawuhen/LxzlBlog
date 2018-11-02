package com.lxzl.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Employeestatusinfo;
import com.lxzl.db.dao.EmployeestatusinfoMapper;
import com.lxzl.service.EmployeestatusinfoService;

@Service("employeestatusinfoService")
public class EmployeestatusinfoServiceImpl implements EmployeestatusinfoService {

	@Autowired
	EmployeestatusinfoMapper employeestatusinfoMapper;

	@Transactional
	public Integer insertBatch(List<Employeestatusinfo> list) {
		return employeestatusinfoMapper.insertBatch(list);
	}

	@Transactional
	public Integer insert(Employeestatusinfo employeestatusinfo) {
		return employeestatusinfoMapper.insert(employeestatusinfo);
	}

	@Transactional
	public List<Employeestatusinfo> select(Map<String, String> map) {
		return employeestatusinfoMapper.select(map);
	}

}
