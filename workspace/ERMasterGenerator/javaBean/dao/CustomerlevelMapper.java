package com.cn.db.mapper;

import java.util.List;
import java.util.Map;

import com.cn.db.bean.Customerlevel;

public interface CustomerlevelMapper {
	
	List<Customerlevel> select(Map<String, String> map);

	Integer insertBatch(List<Customerlevel> list);
	
	Integer insert(Customerlevel customerlevel);
	
	Integer updateById(Customerlevel customerlevel);

	Integer deleteById(@Param("id") Integer id);
}