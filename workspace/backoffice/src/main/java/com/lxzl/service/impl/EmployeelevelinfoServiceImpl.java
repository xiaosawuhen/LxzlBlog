package com.lxzl.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Employeelevelinfo;
import com.lxzl.db.dao.EmployeelevelinfoMapper;
import com.lxzl.service.EmployeelevelinfoService;

@Service("employeelevelinfoService")
public class EmployeelevelinfoServiceImpl implements EmployeelevelinfoService {

	@Autowired
	EmployeelevelinfoMapper employeelevelinfoMapper;

	@Transactional
	public Integer insertBatch(List<Employeelevelinfo> list) {
		return employeelevelinfoMapper.insertBatch(list);
	}

	@Transactional
	public Integer insert(Employeelevelinfo employeelevelinfo) {
		return employeelevelinfoMapper.insert(employeelevelinfo);
	}

	@Transactional
	public List<Employeelevelinfo> select(Map<String, String> map) {
		return employeelevelinfoMapper.select(map);
	}

}
