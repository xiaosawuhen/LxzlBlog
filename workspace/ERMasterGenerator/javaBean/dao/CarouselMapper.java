package com.lxzl.db.mapper;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Carousel;

public interface CarouselMapper {
	
	List<Carousel> select(Map<String, String> map);

	Integer insertBatch(List<Carousel> list);
	
	Integer insert(Carousel carousel);
	
	Integer updateById(Carousel carousel);

	Integer deleteById(@Param("id") Integer id);
}