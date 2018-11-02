package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Customercompanyinfo;

public interface CustomercompanyinfoService {

	Integer insertBatch(List<Customercompanyinfo> list);

	Integer insert(Customercompanyinfo customercompanyinfo);

	List<Customercompanyinfo> select(Map<String, String> map);

}
