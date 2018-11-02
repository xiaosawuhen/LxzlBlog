package com.cn.db.service;

import java.util.List;
import com.cn.db.bean.Customer;

public interface CustomerService{

	Integer insertBatch(List<Customer> list);
	
	Integer insert(Customer customer);
	
	List<Customer> select(Map<String, String> map);
	
	Integer updateById(Customer customer);
	
	Integer deleteById(@Param("id") Integer id);
	
}