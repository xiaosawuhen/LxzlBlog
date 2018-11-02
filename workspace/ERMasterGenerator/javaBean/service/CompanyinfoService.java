package com.cn.db.service;

import java.util.List;
import com.cn.db.bean.Companyinfo;

public interface CompanyinfoService{

	Integer insertBatch(List<Companyinfo> list);
	
	Integer insert(Companyinfo companyinfo);
	
	List<Companyinfo> select(Map<String, String> map);
	
	Integer updateById(Companyinfo companyinfo);
	
	Integer deleteById(@Param("id") Integer id);
	
}