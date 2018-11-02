package com.cn.db.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.db.bean.Employeelevel;
import com.cn.db.mapper.EmployeelevelMapper;
import com.cn.db.service.EmployeelevelService;

@Service("employeelevelService")
public class EmployeelevelServiceImpl implements EmployeelevelService{
	
	@Autowired
	EmployeelevelMapper employeelevelMapper;
	
	public List<Employeelevel> select(Map<String, String> map) {
		return employeelevelMapper.select(map);
	}

	@Transactional
	public Integer insertBatch(List<EmployeelevelMapper> list) {
		return employeelevelMapper.insertBatch(list);
	}
	
	@Transactional
	public Integer insert(Employeelevel employeelevel) {
		return employeelevelMapper.insert(employeelevel);
	}
	
	@Transactional
	public Integer updateById(Employeelevel employeelevel) {
		return employeelevelMapper.updateById(employeelevel);
	}
	
	@Transactional
	public Integer deleteById(Integer id) {
		return employeelevelMapper.deleteById(list);
	}
}