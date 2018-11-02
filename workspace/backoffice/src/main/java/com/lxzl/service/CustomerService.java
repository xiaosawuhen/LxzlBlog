package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Customer;

public interface CustomerService {

	Integer insertBatch(List<Customer> list);

	Integer insert(Customer customer);

	List<Customer> select(Map<String, String> map);

}
