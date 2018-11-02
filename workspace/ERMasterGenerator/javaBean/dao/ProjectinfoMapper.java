package com.cn.db.mapper;

import java.util.List;
import java.util.Map;

import com.cn.db.bean.Projectinfo;

public interface ProjectinfoMapper {
	
	List<Projectinfo> select(Map<String, String> map);

	Integer insertBatch(List<Projectinfo> list);
	
	Integer insert(Projectinfo projectinfo);
	
	Integer updateById(Projectinfo projectinfo);

	Integer deleteById(@Param("id") Integer id);
}