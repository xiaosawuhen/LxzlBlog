package com.cn.db.mapper;

import java.util.List;
import java.util.Map;

import com.cn.db.bean.Employee;

public interface EmployeeMapper {
	
	List<Employee> select(Map<String, String> map);

	Integer insertBatch(List<Employee> list);
	
	Integer insert(Employee employee);
	
	Integer updateById(Employee employee);

	Integer deleteById(@Param("id") Integer id);
}