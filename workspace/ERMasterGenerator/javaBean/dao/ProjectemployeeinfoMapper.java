package com.cn.db.mapper;

import java.util.List;
import java.util.Map;

import com.cn.db.bean.Projectemployeeinfo;

public interface ProjectemployeeinfoMapper {
	
	List<Projectemployeeinfo> select(Map<String, String> map);

	Integer insertBatch(List<Projectemployeeinfo> list);
	
	Integer insert(Projectemployeeinfo projectemployeeinfo);
	
	Integer updateById(Projectemployeeinfo projectemployeeinfo);

	Integer deleteById(@Param("id") Integer id);
}