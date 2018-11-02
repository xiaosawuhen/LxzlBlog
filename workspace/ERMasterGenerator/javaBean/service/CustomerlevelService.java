package com.cn.db.service;

import java.util.List;
import com.cn.db.bean.Customerlevel;

public interface CustomerlevelService{

	Integer insertBatch(List<Customerlevel> list);
	
	Integer insert(Customerlevel customerlevel);
	
	List<Customerlevel> select(Map<String, String> map);
	
	Integer updateById(Customerlevel customerlevel);
	
	Integer deleteById(@Param("id") Integer id);
	
}