package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Project;
import com.lxzl.db.transfor.bean.ProjectBean;

public interface ProjectService {

	Integer insertBatch(List<ProjectBean> list);

	List<Project> select(Map<String, String> map);

	List<ProjectBean> selectByCnt(Map<String, Object> paramMap);

	ProjectBean selectById(Integer pid);

	Integer updateById(ProjectBean projectBean);

	Integer insert(ProjectBean projectBean);

	Integer deleteById(Long long1);

}
