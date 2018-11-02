package com.lxzl.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Project;
import com.lxzl.db.dao.ProjectMapper;
import com.lxzl.db.dao.ProjectinfoMapper;
import com.lxzl.db.transfor.bean.ProjectBean;
import com.lxzl.service.ProjectService;

@Service("projectService")
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	ProjectMapper projectMapper;
	
	@Autowired
	ProjectinfoMapper projectinfoMapper;

	@Transactional
	public Integer insertBatch(List<ProjectBean> list) {
		return projectMapper.insertBatch(list);
	}

	@Transactional
	public List<Project> select(Map<String, String> map) {
		return projectMapper.select(map);
	}

	public List<ProjectBean> selectByCnt(Map<String, Object> paramMap) {
		return projectMapper.selectByCnt(paramMap);
	}

	public ProjectBean selectById(Integer pid) {
		return projectMapper.selectById(pid);
	}

	@Transactional
	public Integer updateById(ProjectBean projectBean) {
		Integer cnt = projectMapper.updateById(projectBean);
		
		if(cnt > 0) {
			Integer piCnt = projectinfoMapper.updateById(projectBean);
			return piCnt;
		}
		
		return 0;
	}

	public Integer insert(ProjectBean projectBean) {
		Integer cnt = projectMapper.insert(projectBean);
		
		if(cnt > 0) {
			Integer piCnt = projectinfoMapper.insert(projectBean);
			return piCnt;
		}
		
		return 0;
	}

	public Integer deleteById(Long pid) {
		Integer cnt = projectMapper.deleteById(pid);
		
		if(cnt > 0) {
			Integer piCnt = projectinfoMapper.deleteById(pid);
			return piCnt;
		}
		
		return 0;
	}

}
