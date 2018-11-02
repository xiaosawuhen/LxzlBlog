package com.cn.db.mapper;

import java.util.List;
import java.util.Map;

import com.cn.db.bean.Companyinfo;

public interface CompanyinfoMapper {
	
	List<Companyinfo> select(Map<String, String> map);

	Integer insertBatch(List<Companyinfo> list);
	
	Integer insert(Companyinfo companyinfo);
	
	Integer updateById(Companyinfo companyinfo);

	Integer deleteById(@Param("id") Integer id);
}