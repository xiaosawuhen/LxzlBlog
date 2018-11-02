package com.cn.db.service;

import java.util.List;
import com.cn.db.bean.Customercompanyinfo;

public interface CustomercompanyinfoService{

	Integer insertBatch(List<Customercompanyinfo> list);
	
	Integer insert(Customercompanyinfo customercompanyinfo);
	
	List<Customercompanyinfo> select(Map<String, String> map);
	
	Integer updateById(Customercompanyinfo customercompanyinfo);
	
	Integer deleteById(@Param("id") Integer id);
	
}