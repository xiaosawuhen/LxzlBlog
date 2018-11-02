package com.lxzl.db.mapper;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Productinfo;

public interface ProductinfoMapper {
	
	List<Productinfo> select(Map<String, String> map);

	Integer insertBatch(List<Productinfo> list);
	
	Integer insert(Productinfo productinfo);
	
	Integer updateById(Productinfo productinfo);

	Integer deleteById(@Param("id") Integer id);
}