package com.cn.db.service;

import java.util.List;
import com.cn.db.bean.Employeelevelinfo;

public interface EmployeelevelinfoService{

	Integer insertBatch(List<Employeelevelinfo> list);
	
	Integer insert(Employeelevelinfo employeelevelinfo);
	
	List<Employeelevelinfo> select(Map<String, String> map);
	
	Integer updateById(Employeelevelinfo employeelevelinfo);
	
	Integer deleteById(@Param("id") Integer id);
	
}