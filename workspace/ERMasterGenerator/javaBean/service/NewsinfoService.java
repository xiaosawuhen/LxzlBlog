package com.lxzl.db.service;

import java.util.List;
import com.lxzl.db.bean.Newsinfo;

public interface NewsinfoService{

	Integer insertBatch(List<Newsinfo> list);
	
	Integer insert(Newsinfo newsinfo);
	
	List<Newsinfo> select(Map<String, String> map);
	
	Integer updateById(Newsinfo newsinfo);
	
	Integer deleteById(@Param("id") Integer id);
	
}