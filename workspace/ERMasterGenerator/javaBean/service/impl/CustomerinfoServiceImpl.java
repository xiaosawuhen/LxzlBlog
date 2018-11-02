package com.cn.db.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.db.bean.Customerinfo;
import com.cn.db.mapper.CustomerinfoMapper;
import com.cn.db.service.CustomerinfoService;

@Service("customerinfoService")
public class CustomerinfoServiceImpl implements CustomerinfoService{
	
	@Autowired
	CustomerinfoMapper customerinfoMapper;
	
	public List<Customerinfo> select(Map<String, String> map) {
		return customerinfoMapper.select(map);
	}

	@Transactional
	public Integer insertBatch(List<CustomerinfoMapper> list) {
		return customerinfoMapper.insertBatch(list);
	}
	
	@Transactional
	public Integer insert(Customerinfo customerinfo) {
		return customerinfoMapper.insert(customerinfo);
	}
	
	@Transactional
	public Integer updateById(Customerinfo customerinfo) {
		return customerinfoMapper.updateById(customerinfo);
	}
	
	@Transactional
	public Integer deleteById(Integer id) {
		return customerinfoMapper.deleteById(list);
	}
}