package com.lxzl.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Employeelevel;
import com.lxzl.db.dao.EmployeelevelMapper;
import com.lxzl.service.EmployeelevelService;

@Service("employeelevelService")
public class EmployeelevelServiceImpl implements EmployeelevelService {

	@Autowired
	EmployeelevelMapper employeelevelMapper;

	@Transactional
	public Integer insertBatch(List<Employeelevel> list) {
		return employeelevelMapper.insertBatch(list);
	}

	@Transactional
	public Integer insert(Employeelevel employeelevel) {
		return employeelevelMapper.insert(employeelevel);
	}

	@Transactional
	public List<Employeelevel> select(Map<String, String> map) {
		return employeelevelMapper.select(map);
	}

}
