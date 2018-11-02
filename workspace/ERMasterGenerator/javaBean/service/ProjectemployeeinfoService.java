package com.cn.db.service;

import java.util.List;
import com.cn.db.bean.Projectemployeeinfo;

public interface ProjectemployeeinfoService{

	Integer insertBatch(List<Projectemployeeinfo> list);
	
	Integer insert(Projectemployeeinfo projectemployeeinfo);
	
	List<Projectemployeeinfo> select(Map<String, String> map);
	
	Integer updateById(Projectemployeeinfo projectemployeeinfo);
	
	Integer deleteById(@Param("id") Integer id);
	
}