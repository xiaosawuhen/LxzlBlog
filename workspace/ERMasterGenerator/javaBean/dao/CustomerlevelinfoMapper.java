package com.cn.db.mapper;

import java.util.List;
import java.util.Map;

import com.cn.db.bean.Customerlevelinfo;

public interface CustomerlevelinfoMapper {
	
	List<Customerlevelinfo> select(Map<String, String> map);

	Integer insertBatch(List<Customerlevelinfo> list);
	
	Integer insert(Customerlevelinfo customerlevelinfo);
	
	Integer updateById(Customerlevelinfo customerlevelinfo);

	Integer deleteById(@Param("id") Integer id);
}