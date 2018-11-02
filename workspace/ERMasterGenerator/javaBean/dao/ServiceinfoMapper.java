package com.lxzl.db.mapper;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Serviceinfo;

public interface ServiceinfoMapper {
	
	List<Serviceinfo> select(Map<String, String> map);

	Integer insertBatch(List<Serviceinfo> list);
	
	Integer insert(Serviceinfo serviceinfo);
	
	Integer updateById(Serviceinfo serviceinfo);

	Integer deleteById(@Param("id") Integer id);
}