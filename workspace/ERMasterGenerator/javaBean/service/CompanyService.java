package com.cn.db.service;

import java.util.List;
import com.cn.db.bean.Company;

public interface CompanyService{

	Integer insertBatch(List<Company> list);
	
	Integer insert(Company company);
	
	List<Company> select(Map<String, String> map);
	
	Integer updateById(Company company);
	
	Integer deleteById(@Param("id") Integer id);
	
}