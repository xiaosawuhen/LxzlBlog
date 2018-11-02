package com.lxzl.db.mapper;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Partners;

public interface PartnersMapper {
	
	List<Partners> select(Map<String, String> map);

	Integer insertBatch(List<Partners> list);
	
	Integer insert(Partners partners);
	
	Integer updateById(Partners partners);

	Integer deleteById(@Param("id") Integer id);
}