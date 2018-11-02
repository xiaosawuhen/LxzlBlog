package com.cn.db.mapper;

import java.util.List;
import java.util.Map;

import com.cn.db.bean.Companyemployeeinfo;

public interface CompanyemployeeinfoMapper {
	
	List<Companyemployeeinfo> select(Map<String, String> map);

	Integer insertBatch(List<Companyemployeeinfo> list);
	
	Integer insert(Companyemployeeinfo companyemployeeinfo);
	
	Integer updateById(Companyemployeeinfo companyemployeeinfo);

	Integer deleteById(@Param("id") Integer id);
}