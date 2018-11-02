package com.cn.db.service;

import java.util.List;
import com.cn.db.bean.Customerlevelinfo;

public interface CustomerlevelinfoService{

	Integer insertBatch(List<Customerlevelinfo> list);
	
	Integer insert(Customerlevelinfo customerlevelinfo);
	
	List<Customerlevelinfo> select(Map<String, String> map);
	
	Integer updateById(Customerlevelinfo customerlevelinfo);
	
	Integer deleteById(@Param("id") Integer id);
	
}