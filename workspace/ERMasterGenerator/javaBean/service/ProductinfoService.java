package com.lxzl.db.service;

import java.util.List;
import com.lxzl.db.bean.Productinfo;

public interface ProductinfoService{

	Integer insertBatch(List<Productinfo> list);
	
	Integer insert(Productinfo productinfo);
	
	List<Productinfo> select(Map<String, String> map);
	
	Integer updateById(Productinfo productinfo);
	
	Integer deleteById(@Param("id") Integer id);
	
}