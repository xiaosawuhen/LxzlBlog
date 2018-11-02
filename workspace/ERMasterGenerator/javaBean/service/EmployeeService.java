package com.cn.db.service;

import java.util.List;
import com.cn.db.bean.Employee;

public interface EmployeeService{

	Integer insertBatch(List<Employee> list);
	
	Integer insert(Employee employee);
	
	List<Employee> select(Map<String, String> map);
	
	Integer updateById(Employee employee);
	
	Integer deleteById(@Param("id") Integer id);
	
}