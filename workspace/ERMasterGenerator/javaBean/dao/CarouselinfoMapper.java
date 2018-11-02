package com.lxzl.db.mapper;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Carouselinfo;

public interface CarouselinfoMapper {
	
	List<Carouselinfo> select(Map<String, String> map);

	Integer insertBatch(List<Carouselinfo> list);
	
	Integer insert(Carouselinfo carouselinfo);
	
	Integer updateById(Carouselinfo carouselinfo);

	Integer deleteById(@Param("id") Integer id);
}