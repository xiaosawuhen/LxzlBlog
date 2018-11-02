package com.cn.db.service;

import java.util.List;
import com.cn.db.bean.Employeeinfo;

public interface EmployeeinfoService{

	Integer insertBatch(List<Employeeinfo> list);
	
	Integer insert(Employeeinfo employeeinfo);
	
	List<Employeeinfo> select(Map<String, String> map);
	
	Integer updateById(Employeeinfo employeeinfo);
	
	Integer deleteById(@Param("id") Integer id);
	
}