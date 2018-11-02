package com.cn.db.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.db.bean.Projectemployeeinfo;
import com.cn.db.mapper.ProjectemployeeinfoMapper;
import com.cn.db.service.ProjectemployeeinfoService;

@Service("projectemployeeinfoService")
public class ProjectemployeeinfoServiceImpl implements ProjectemployeeinfoService{
	
	@Autowired
	ProjectemployeeinfoMapper projectemployeeinfoMapper;
	
	public List<Projectemployeeinfo> select(Map<String, String> map) {
		return projectemployeeinfoMapper.select(map);
	}

	@Transactional
	public Integer insertBatch(List<ProjectemployeeinfoMapper> list) {
		return projectemployeeinfoMapper.insertBatch(list);
	}
	
	@Transactional
	public Integer insert(Projectemployeeinfo projectemployeeinfo) {
		return projectemployeeinfoMapper.insert(projectemployeeinfo);
	}
	
	@Transactional
	public Integer updateById(Projectemployeeinfo projectemployeeinfo) {
		return projectemployeeinfoMapper.updateById(projectemployeeinfo);
	}
	
	@Transactional
	public Integer deleteById(Integer id) {
		return projectemployeeinfoMapper.deleteById(list);
	}
}