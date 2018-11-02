package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Serviceinfo;

public interface ServiceinfoService {

	Integer insertBatch(List<Serviceinfo> list);

	List<Serviceinfo> select(Map<String, String> map);

}
