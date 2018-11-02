package com.cn.db.service;

import java.util.List;
import com.cn.db.bean.Employeelevel;

public interface EmployeelevelService{

	Integer insertBatch(List<Employeelevel> list);
	
	Integer insert(Employeelevel employeelevel);
	
	List<Employeelevel> select(Map<String, String> map);
	
	Integer updateById(Employeelevel employeelevel);
	
	Integer deleteById(@Param("id") Integer id);
	
}