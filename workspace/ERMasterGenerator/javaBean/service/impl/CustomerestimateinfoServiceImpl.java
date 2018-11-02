package com.cn.db.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.db.bean.Customerestimateinfo;
import com.cn.db.mapper.CustomerestimateinfoMapper;
import com.cn.db.service.CustomerestimateinfoService;

@Service("customerestimateinfoService")
public class CustomerestimateinfoServiceImpl implements CustomerestimateinfoService{
	
	@Autowired
	CustomerestimateinfoMapper customerestimateinfoMapper;
	
	public List<Customerestimateinfo> select(Map<String, String> map) {
		return customerestimateinfoMapper.select(map);
	}

	@Transactional
	public Integer insertBatch(List<CustomerestimateinfoMapper> list) {
		return customerestimateinfoMapper.insertBatch(list);
	}
	
	@Transactional
	public Integer insert(Customerestimateinfo customerestimateinfo) {
		return customerestimateinfoMapper.insert(customerestimateinfo);
	}
	
	@Transactional
	public Integer updateById(Customerestimateinfo customerestimateinfo) {
		return customerestimateinfoMapper.updateById(customerestimateinfo);
	}
	
	@Transactional
	public Integer deleteById(Integer id) {
		return customerestimateinfoMapper.deleteById(list);
	}
}