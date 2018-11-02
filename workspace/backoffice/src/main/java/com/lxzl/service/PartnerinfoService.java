package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Partnerinfo;

public interface PartnerinfoService {

	Integer insertBatch(List<Partnerinfo> list);

	List<Partnerinfo> select(Map<String, String> map);

}
