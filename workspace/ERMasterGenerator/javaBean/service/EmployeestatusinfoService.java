package com.cn.db.service;

import java.util.List;
import com.cn.db.bean.Employeestatusinfo;

public interface EmployeestatusinfoService{

	Integer insertBatch(List<Employeestatusinfo> list);
	
	Integer insert(Employeestatusinfo employeestatusinfo);
	
	List<Employeestatusinfo> select(Map<String, String> map);
	
	Integer updateById(Employeestatusinfo employeestatusinfo);
	
	Integer deleteById(@Param("id") Integer id);
	
}