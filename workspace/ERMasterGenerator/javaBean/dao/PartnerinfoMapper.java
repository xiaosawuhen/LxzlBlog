package com.lxzl.db.mapper;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Partnerinfo;

public interface PartnerinfoMapper {
	
	List<Partnerinfo> select(Map<String, String> map);

	Integer insertBatch(List<Partnerinfo> list);
	
	Integer insert(Partnerinfo partnerinfo);
	
	Integer updateById(Partnerinfo partnerinfo);

	Integer deleteById(@Param("id") Integer id);
}