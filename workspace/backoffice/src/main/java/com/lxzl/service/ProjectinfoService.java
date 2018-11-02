package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Projectinfo;
import com.lxzl.db.transfor.bean.ProjectBean;

public interface ProjectinfoService {

	Integer insertBatch(List<ProjectBean> list);

	Integer insert(ProjectBean projectinfo);

	List<Projectinfo> select(Map<String, String> map);

}
