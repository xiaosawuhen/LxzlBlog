package com.lxzl.db.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Carouselinfo;
import com.lxzl.db.mapper.CarouselinfoMapper;
import com.lxzl.db.service.CarouselinfoService;

@Service("carouselinfoService")
public class CarouselinfoServiceImpl implements CarouselinfoService{
	
	@Autowired
	CarouselinfoMapper carouselinfoMapper;
	
	public List<Carouselinfo> select(Map<String, String> map) {
		return carouselinfoMapper.select(map);
	}

	@Transactional
	public Integer insertBatch(List<CarouselinfoMapper> list) {
		return carouselinfoMapper.insertBatch(list);
	}
	
	@Transactional
	public Integer insert(Carouselinfo carouselinfo) {
		return carouselinfoMapper.insert(carouselinfo);
	}
	
	@Transactional
	public Integer updateById(Carouselinfo carouselinfo) {
		return carouselinfoMapper.updateById(carouselinfo);
	}
	
	@Transactional
	public Integer deleteById(Integer id) {
		return carouselinfoMapper.deleteById(list);
	}
}