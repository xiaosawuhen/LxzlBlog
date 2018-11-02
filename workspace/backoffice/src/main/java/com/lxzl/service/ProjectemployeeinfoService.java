package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Projectemployeeinfo;

public interface ProjectemployeeinfoService {

	Integer insertBatch(List<Projectemployeeinfo> list);

	Integer insert(Projectemployeeinfo projectemployeeinfo);

	List<Projectemployeeinfo> select(Map<String, String> map);

}
