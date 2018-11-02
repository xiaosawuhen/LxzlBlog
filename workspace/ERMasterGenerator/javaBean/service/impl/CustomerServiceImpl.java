package com.cn.db.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.db.bean.Customer;
import com.cn.db.mapper.CustomerMapper;
import com.cn.db.service.CustomerService;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerMapper customerMapper;
	
	public List<Customer> select(Map<String, String> map) {
		return customerMapper.select(map);
	}

	@Transactional
	public Integer insertBatch(List<CustomerMapper> list) {
		return customerMapper.insertBatch(list);
	}
	
	@Transactional
	public Integer insert(Customer customer) {
		return customerMapper.insert(customer);
	}
	
	@Transactional
	public Integer updateById(Customer customer) {
		return customerMapper.updateById(customer);
	}
	
	@Transactional
	public Integer deleteById(Integer id) {
		return customerMapper.deleteById(list);
	}
}