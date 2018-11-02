package com.cn.db.mapper;

import java.util.List;
import java.util.Map;

import com.cn.db.bean.Employeestatusinfo;

public interface EmployeestatusinfoMapper {
	
	List<Employeestatusinfo> select(Map<String, String> map);

	Integer insertBatch(List<Employeestatusinfo> list);
	
	Integer insert(Employeestatusinfo employeestatusinfo);
	
	Integer updateById(Employeestatusinfo employeestatusinfo);

	Integer deleteById(@Param("id") Integer id);
}