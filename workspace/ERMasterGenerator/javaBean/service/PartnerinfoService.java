package com.lxzl.db.service;

import java.util.List;
import com.lxzl.db.bean.Partnerinfo;

public interface PartnerinfoService{

	Integer insertBatch(List<Partnerinfo> list);
	
	Integer insert(Partnerinfo partnerinfo);
	
	List<Partnerinfo> select(Map<String, String> map);
	
	Integer updateById(Partnerinfo partnerinfo);
	
	Integer deleteById(@Param("id") Integer id);
	
}