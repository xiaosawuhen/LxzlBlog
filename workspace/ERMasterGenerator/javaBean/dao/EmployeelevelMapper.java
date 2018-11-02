package com.cn.db.mapper;

import java.util.List;
import java.util.Map;

import com.cn.db.bean.Employeelevel;

public interface EmployeelevelMapper {
	
	List<Employeelevel> select(Map<String, String> map);

	Integer insertBatch(List<Employeelevel> list);
	
	Integer insert(Employeelevel employeelevel);
	
	Integer updateById(Employeelevel employeelevel);

	Integer deleteById(@Param("id") Integer id);
}