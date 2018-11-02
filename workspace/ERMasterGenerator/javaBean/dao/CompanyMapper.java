package com.cn.db.mapper;

import java.util.List;
import java.util.Map;

import com.cn.db.bean.Company;

public interface CompanyMapper {
	
	List<Company> select(Map<String, String> map);

	Integer insertBatch(List<Company> list);
	
	Integer insert(Company company);
	
	Integer updateById(Company company);

	Integer deleteById(@Param("id") Integer id);
}