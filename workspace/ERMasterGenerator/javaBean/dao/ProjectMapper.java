package com.cn.db.mapper;

import java.util.List;
import java.util.Map;

import com.cn.db.bean.Project;

public interface ProjectMapper {
	
	List<Project> select(Map<String, String> map);

	Integer insertBatch(List<Project> list);
	
	Integer insert(Project project);
	
	Integer updateById(Project project);

	Integer deleteById(@Param("id") Integer id);
}