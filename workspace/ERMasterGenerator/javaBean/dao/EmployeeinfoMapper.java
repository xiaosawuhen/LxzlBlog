package com.cn.db.mapper;

import java.util.List;
import java.util.Map;

import com.cn.db.bean.Employeeinfo;

public interface EmployeeinfoMapper {
	
	List<Employeeinfo> select(Map<String, String> map);

	Integer insertBatch(List<Employeeinfo> list);
	
	Integer insert(Employeeinfo employeeinfo);
	
	Integer updateById(Employeeinfo employeeinfo);

	Integer deleteById(@Param("id") Integer id);
}