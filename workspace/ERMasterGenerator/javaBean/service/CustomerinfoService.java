package com.cn.db.service;

import java.util.List;
import com.cn.db.bean.Customerinfo;

public interface CustomerinfoService{

	Integer insertBatch(List<Customerinfo> list);
	
	Integer insert(Customerinfo customerinfo);
	
	List<Customerinfo> select(Map<String, String> map);
	
	Integer updateById(Customerinfo customerinfo);
	
	Integer deleteById(@Param("id") Integer id);
	
}