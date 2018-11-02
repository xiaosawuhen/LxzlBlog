package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Newsinfo;

public interface NewsinfoService {

	Integer insertBatch(List<Newsinfo> list);

	List<Newsinfo> select(Map<String, String> map);

}
