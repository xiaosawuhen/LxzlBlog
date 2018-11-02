package com.cn.db.mapper;

import java.util.List;
import java.util.Map;

import com.cn.db.bean.Customercompanyinfo;

public interface CustomercompanyinfoMapper {
	
	List<Customercompanyinfo> select(Map<String, String> map);

	Integer insertBatch(List<Customercompanyinfo> list);
	
	Integer insert(Customercompanyinfo customercompanyinfo);
	
	Integer updateById(Customercompanyinfo customercompanyinfo);

	Integer deleteById(@Param("id") Integer id);
}