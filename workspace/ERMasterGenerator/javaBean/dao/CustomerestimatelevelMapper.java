package com.cn.db.mapper;

import java.util.List;
import java.util.Map;

import com.cn.db.bean.Customerestimatelevel;

public interface CustomerestimatelevelMapper {
	
	List<Customerestimatelevel> select(Map<String, String> map);

	Integer insertBatch(List<Customerestimatelevel> list);
	
	Integer insert(Customerestimatelevel customerestimatelevel);
	
	Integer updateById(Customerestimatelevel customerestimatelevel);

	Integer deleteById(@Param("id") Integer id);
}