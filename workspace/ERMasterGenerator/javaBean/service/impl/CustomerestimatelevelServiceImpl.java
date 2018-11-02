package com.cn.db.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.db.bean.Customerestimatelevel;
import com.cn.db.mapper.CustomerestimatelevelMapper;
import com.cn.db.service.CustomerestimatelevelService;

@Service("customerestimatelevelService")
public class CustomerestimatelevelServiceImpl implements CustomerestimatelevelService{
	
	@Autowired
	CustomerestimatelevelMapper customerestimatelevelMapper;
	
	public List<Customerestimatelevel> select(Map<String, String> map) {
		return customerestimatelevelMapper.select(map);
	}

	@Transactional
	public Integer insertBatch(List<CustomerestimatelevelMapper> list) {
		return customerestimatelevelMapper.insertBatch(list);
	}
	
	@Transactional
	public Integer insert(Customerestimatelevel customerestimatelevel) {
		return customerestimatelevelMapper.insert(customerestimatelevel);
	}
	
	@Transactional
	public Integer updateById(Customerestimatelevel customerestimatelevel) {
		return customerestimatelevelMapper.updateById(customerestimatelevel);
	}
	
	@Transactional
	public Integer deleteById(Integer id) {
		return customerestimatelevelMapper.deleteById(list);
	}
}