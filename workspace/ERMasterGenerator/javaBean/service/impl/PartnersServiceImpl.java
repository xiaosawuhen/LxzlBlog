package com.lxzl.db.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Partners;
import com.lxzl.db.mapper.PartnersMapper;
import com.lxzl.db.service.PartnersService;

@Service("partnersService")
public class PartnersServiceImpl implements PartnersService{
	
	@Autowired
	PartnersMapper partnersMapper;
	
	public List<Partners> select(Map<String, String> map) {
		return partnersMapper.select(map);
	}

	@Transactional
	public Integer insertBatch(List<PartnersMapper> list) {
		return partnersMapper.insertBatch(list);
	}
	
	@Transactional
	public Integer insert(Partners partners) {
		return partnersMapper.insert(partners);
	}
	
	@Transactional
	public Integer updateById(Partners partners) {
		return partnersMapper.updateById(partners);
	}
	
	@Transactional
	public Integer deleteById(Integer id) {
		return partnersMapper.deleteById(list);
	}
}