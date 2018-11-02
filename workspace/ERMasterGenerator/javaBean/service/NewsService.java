package com.lxzl.db.service;

import java.util.List;
import com.lxzl.db.bean.News;

public interface NewsService{

	Integer insertBatch(List<News> list);
	
	Integer insert(News news);
	
	List<News> select(Map<String, String> map);
	
	Integer updateById(News news);
	
	Integer deleteById(@Param("id") Integer id);
	
}