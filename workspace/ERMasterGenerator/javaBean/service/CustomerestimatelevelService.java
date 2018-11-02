package com.cn.db.service;

import java.util.List;
import com.cn.db.bean.Customerestimatelevel;

public interface CustomerestimatelevelService{

	Integer insertBatch(List<Customerestimatelevel> list);
	
	Integer insert(Customerestimatelevel customerestimatelevel);
	
	List<Customerestimatelevel> select(Map<String, String> map);
	
	Integer updateById(Customerestimatelevel customerestimatelevel);
	
	Integer deleteById(@Param("id") Integer id);
	
}