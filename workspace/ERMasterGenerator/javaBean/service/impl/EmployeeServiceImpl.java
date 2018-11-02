package com.cn.db.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.db.bean.Employee;
import com.cn.db.mapper.EmployeeMapper;
import com.cn.db.service.EmployeeService;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeMapper employeeMapper;
	
	public List<Employee> select(Map<String, String> map) {
		return employeeMapper.select(map);
	}

	@Transactional
	public Integer insertBatch(List<EmployeeMapper> list) {
		return employeeMapper.insertBatch(list);
	}
	
	@Transactional
	public Integer insert(Employee employee) {
		return employeeMapper.insert(employee);
	}
	
	@Transactional
	public Integer updateById(Employee employee) {
		return employeeMapper.updateById(employee);
	}
	
	@Transactional
	public Integer deleteById(Integer id) {
		return employeeMapper.deleteById(list);
	}
}