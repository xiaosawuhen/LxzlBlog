package com.cn.db.service;

import java.util.List;
import com.cn.db.bean.Employeestatus;

public interface EmployeestatusService{

	Integer insertBatch(List<Employeestatus> list);
	
	Integer insert(Employeestatus employeestatus);
	
	List<Employeestatus> select(Map<String, String> map);
	
	Integer updateById(Employeestatus employeestatus);
	
	Integer deleteById(@Param("id") Integer id);
	
}