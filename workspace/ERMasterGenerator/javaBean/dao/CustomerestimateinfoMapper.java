package com.cn.db.mapper;

import java.util.List;
import java.util.Map;

import com.cn.db.bean.Customerestimateinfo;

public interface CustomerestimateinfoMapper {
	
	List<Customerestimateinfo> select(Map<String, String> map);

	Integer insertBatch(List<Customerestimateinfo> list);
	
	Integer insert(Customerestimateinfo customerestimateinfo);
	
	Integer updateById(Customerestimateinfo customerestimateinfo);

	Integer deleteById(@Param("id") Integer id);
}