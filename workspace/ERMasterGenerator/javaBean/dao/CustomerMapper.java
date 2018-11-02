package com.cn.db.mapper;

import java.util.List;
import java.util.Map;

import com.cn.db.bean.Customer;

public interface CustomerMapper {
	
	List<Customer> select(Map<String, String> map);

	Integer insertBatch(List<Customer> list);
	
	Integer insert(Customer customer);
	
	Integer updateById(Customer customer);

	Integer deleteById(@Param("id") Integer id);
}