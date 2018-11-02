package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Customerinfo;

public interface CustomerinfoService {

	Integer insertBatch(List<Customerinfo> list);

	Integer insert(Customerinfo customerinfo);

	List<Customerinfo> select(Map<String, String> map);
	
	Customerinfo selectByAliasName(String aliasName);
}
