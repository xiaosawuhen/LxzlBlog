package com.lxzl.db.mapper;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.News;

public interface NewsMapper {
	
	List<News> select(Map<String, String> map);

	Integer insertBatch(List<News> list);
	
	Integer insert(News news);
	
	Integer updateById(News news);

	Integer deleteById(@Param("id") Integer id);
}