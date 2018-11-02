package com.lxzl.db.service;

import java.util.List;
import com.lxzl.db.bean.Partners;

public interface PartnersService{

	Integer insertBatch(List<Partners> list);
	
	Integer insert(Partners partners);
	
	List<Partners> select(Map<String, String> map);
	
	Integer updateById(Partners partners);
	
	Integer deleteById(@Param("id") Integer id);
	
}