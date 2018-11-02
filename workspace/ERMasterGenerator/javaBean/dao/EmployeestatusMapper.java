package com.cn.db.mapper;

import java.util.List;
import java.util.Map;

import com.cn.db.bean.Employeestatus;

public interface EmployeestatusMapper {
	
	List<Employeestatus> select(Map<String, String> map);

	Integer insertBatch(List<Employeestatus> list);
	
	Integer insert(Employeestatus employeestatus);
	
	Integer updateById(Employeestatus employeestatus);

	Integer deleteById(@Param("id") Integer id);
}