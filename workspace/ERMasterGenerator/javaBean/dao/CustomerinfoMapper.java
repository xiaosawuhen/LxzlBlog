package com.cn.db.mapper;

import java.util.List;
import java.util.Map;

import com.cn.db.bean.Customerinfo;

public interface CustomerinfoMapper {
	
	List<Customerinfo> select(Map<String, String> map);

	Integer insertBatch(List<Customerinfo> list);
	
	Integer insert(Customerinfo customerinfo);
	
	Integer updateById(Customerinfo customerinfo);

	Integer deleteById(@Param("id") Integer id);
}