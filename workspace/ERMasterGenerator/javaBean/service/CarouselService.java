package com.lxzl.db.service;

import java.util.List;
import com.lxzl.db.bean.Carousel;

public interface CarouselService{

	Integer insertBatch(List<Carousel> list);
	
	Integer insert(Carousel carousel);
	
	List<Carousel> select(Map<String, String> map);
	
	Integer updateById(Carousel carousel);
	
	Integer deleteById(@Param("id") Integer id);
	
}