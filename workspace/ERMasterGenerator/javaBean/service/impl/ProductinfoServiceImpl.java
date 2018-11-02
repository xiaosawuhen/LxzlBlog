package com.lxzl.db.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Productinfo;
import com.lxzl.db.mapper.ProductinfoMapper;
import com.lxzl.db.service.ProductinfoService;

@Service("productinfoService")
public class ProductinfoServiceImpl implements ProductinfoService{
	
	@Autowired
	ProductinfoMapper productinfoMapper;
	
	public List<Productinfo> select(Map<String, String> map) {
		return productinfoMapper.select(map);
	}

	@Transactional
	public Integer insertBatch(List<ProductinfoMapper> list) {
		return productinfoMapper.insertBatch(list);
	}
	
	@Transactional
	public Integer insert(Productinfo productinfo) {
		return productinfoMapper.insert(productinfo);
	}
	
	@Transactional
	public Integer updateById(Productinfo productinfo) {
		return productinfoMapper.updateById(productinfo);
	}
	
	@Transactional
	public Integer deleteById(Integer id) {
		return productinfoMapper.deleteById(list);
	}
}