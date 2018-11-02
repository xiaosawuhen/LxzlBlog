package com.cn.db.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.db.bean.Project;
import com.cn.db.mapper.ProjectMapper;
import com.cn.db.service.ProjectService;

@Service("projectService")
public class ProjectServiceImpl implements ProjectService{
	
	@Autowired
	ProjectMapper projectMapper;
	
	public List<Project> select(Map<String, String> map) {
		return projectMapper.select(map);
	}

	@Transactional
	public Integer insertBatch(List<ProjectMapper> list) {
		return projectMapper.insertBatch(list);
	}
	
	@Transactional
	public Integer insert(Project project) {
		return projectMapper.insert(project);
	}
	
	@Transactional
	public Integer updateById(Project project) {
		return projectMapper.updateById(project);
	}
	
	@Transactional
	public Integer deleteById(Integer id) {
		return projectMapper.deleteById(list);
	}
}