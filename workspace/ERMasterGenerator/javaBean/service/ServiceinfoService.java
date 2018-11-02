package com.lxzl.db.service;

import java.util.List;
import com.lxzl.db.bean.Serviceinfo;

public interface ServiceinfoService{

	Integer insertBatch(List<Serviceinfo> list);
	
	Integer insert(Serviceinfo serviceinfo);
	
	List<Serviceinfo> select(Map<String, String> map);
	
	Integer updateById(Serviceinfo serviceinfo);
	
	Integer deleteById(@Param("id") Integer id);
	
}