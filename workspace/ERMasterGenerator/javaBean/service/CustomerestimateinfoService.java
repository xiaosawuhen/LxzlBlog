package com.cn.db.service;

import java.util.List;
import com.cn.db.bean.Customerestimateinfo;

public interface CustomerestimateinfoService{

	Integer insertBatch(List<Customerestimateinfo> list);
	
	Integer insert(Customerestimateinfo customerestimateinfo);
	
	List<Customerestimateinfo> select(Map<String, String> map);
	
	Integer updateById(Customerestimateinfo customerestimateinfo);
	
	Integer deleteById(@Param("id") Integer id);
	
}