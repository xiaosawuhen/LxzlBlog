package com.lxzl.db.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Serviceinfo;
import com.lxzl.db.mapper.ServiceinfoMapper;
import com.lxzl.db.service.ServiceinfoService;

@Service("serviceinfoService")
public class ServiceinfoServiceImpl implements ServiceinfoService{
	
	@Autowired
	ServiceinfoMapper serviceinfoMapper;
	
	public List<Serviceinfo> select(Map<String, String> map) {
		return serviceinfoMapper.select(map);
	}

	@Transactional
	public Integer insertBatch(List<ServiceinfoMapper> list) {
		return serviceinfoMapper.insertBatch(list);
	}
	
	@Transactional
	public Integer insert(Serviceinfo serviceinfo) {
		return serviceinfoMapper.insert(serviceinfo);
	}
	
	@Transactional
	public Integer updateById(Serviceinfo serviceinfo) {
		return serviceinfoMapper.updateById(serviceinfo);
	}
	
	@Transactional
	public Integer deleteById(Integer id) {
		return serviceinfoMapper.deleteById(list);
	}
}