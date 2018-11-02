package com.lxzl.db.mapper;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Newsinfo;

public interface NewsinfoMapper {
	
	List<Newsinfo> select(Map<String, String> map);

	Integer insertBatch(List<Newsinfo> list);
	
	Integer insert(Newsinfo newsinfo);
	
	Integer updateById(Newsinfo newsinfo);

	Integer deleteById(@Param("id") Integer id);
}