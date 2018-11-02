package com.lxzl.db.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Carousel;
import com.lxzl.db.mapper.CarouselMapper;
import com.lxzl.db.service.CarouselService;

@Service("carouselService")
public class CarouselServiceImpl implements CarouselService{
	
	@Autowired
	CarouselMapper carouselMapper;
	
	public List<Carousel> select(Map<String, String> map) {
		return carouselMapper.select(map);
	}

	@Transactional
	public Integer insertBatch(List<CarouselMapper> list) {
		return carouselMapper.insertBatch(list);
	}
	
	@Transactional
	public Integer insert(Carousel carousel) {
		return carouselMapper.insert(carousel);
	}
	
	@Transactional
	public Integer updateById(Carousel carousel) {
		return carouselMapper.updateById(carousel);
	}
	
	@Transactional
	public Integer deleteById(Integer id) {
		return carouselMapper.deleteById(list);
	}
}