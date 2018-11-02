package com.cn.db.service;

import java.util.List;
import com.cn.db.bean.Project;

public interface ProjectService{

	Integer insertBatch(List<Project> list);
	
	Integer insert(Project project);
	
	List<Project> select(Map<String, String> map);
	
	Integer updateById(Project project);
	
	Integer deleteById(@Param("id") Integer id);
	
}