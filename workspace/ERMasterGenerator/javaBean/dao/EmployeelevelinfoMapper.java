package com.cn.db.mapper;

import java.util.List;
import java.util.Map;

import com.cn.db.bean.Employeelevelinfo;

public interface EmployeelevelinfoMapper {
	
	List<Employeelevelinfo> select(Map<String, String> map);

	Integer insertBatch(List<Employeelevelinfo> list);
	
	Integer insert(Employeelevelinfo employeelevelinfo);
	
	Integer updateById(Employeelevelinfo employeelevelinfo);

	Integer deleteById(@Param("id") Integer id);
}