package com.lxzl.db.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Services;
import com.lxzl.db.mapper.ServicesMapper;
import com.lxzl.db.service.ServicesService;

@Service("servicesService")
public class ServicesServiceImpl implements ServicesService{
	
	@Autowired
	ServicesMapper servicesMapper;
	
	public List<Services> select(Map<String, String> map) {
		return servicesMapper.select(map);
	}

	@Transactional
	public Integer insertBatch(List<ServicesMapper> list) {
		return servicesMapper.insertBatch(list);
	}
	
	@Transactional
	public Integer insert(Services services) {
		return servicesMapper.insert(services);
	}
	
	@Transactional
	public Integer updateById(Services services) {
		return servicesMapper.updateById(services);
	}
	
	@Transactional
	public Integer deleteById(Integer id) {
		return servicesMapper.deleteById(list);
	}
}