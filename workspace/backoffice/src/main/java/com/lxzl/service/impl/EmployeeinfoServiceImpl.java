package com.lxzl.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Employeeinfo;
import com.lxzl.db.dao.EmployeeinfoMapper;
import com.lxzl.db.transfor.bean.EmployeeBean;
import com.lxzl.service.EmployeeinfoService;

@Service("employeeinfoService")
public class EmployeeinfoServiceImpl implements EmployeeinfoService {

	@Autowired
	EmployeeinfoMapper employeeinfoMapper;

	@Transactional
	public Integer insertBatch(List<EmployeeBean> list) {
		return employeeinfoMapper.insertBatch(list);
	}

	@Transactional
	public Integer insert(EmployeeBean employeeinfo) {
		return employeeinfoMapper.insert(employeeinfo);
	}

	@Transactional
	public List<Employeeinfo> select(Map<String, String> map) {
		return employeeinfoMapper.select(map);
	}

	public Employeeinfo selectByAliasName(String username) {
		// TODO Auto-generated method stub
		return employeeinfoMapper.selectByAliasName(username);
	}

}
