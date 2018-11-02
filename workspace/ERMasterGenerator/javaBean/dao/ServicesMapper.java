package com.lxzl.db.mapper;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Services;

public interface ServicesMapper {
	
	List<Services> select(Map<String, String> map);

	Integer insertBatch(List<Services> list);
	
	Integer insert(Services services);
	
	Integer updateById(Services services);

	Integer deleteById(@Param("id") Integer id);
}