package com.lxzl.db.service;

import java.util.List;
import com.lxzl.db.bean.Carouselinfo;

public interface CarouselinfoService{

	Integer insertBatch(List<Carouselinfo> list);
	
	Integer insert(Carouselinfo carouselinfo);
	
	List<Carouselinfo> select(Map<String, String> map);
	
	Integer updateById(Carouselinfo carouselinfo);
	
	Integer deleteById(@Param("id") Integer id);
	
}