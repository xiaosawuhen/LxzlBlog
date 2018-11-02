package com.lxzl.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Carousel;
import com.lxzl.db.dao.CarouselMapper;
import com.lxzl.db.dao.CarouselinfoMapper;
import com.lxzl.db.transfor.bean.CarouselBean;
import com.lxzl.service.CarouselService;

@Service("carouselService")
public class CarouselServiceImpl implements CarouselService {

	@Autowired
	CarouselMapper carouselMapper;
	
	@Autowired
	CarouselinfoMapper carouselinfoMapper;

	@Transactional
	public Integer insertBatch(List<Carousel> list) {
		return carouselMapper.insertBatch(list);
	}

	@Transactional
	public List<Carousel> select(Map<String, String> map) {
		return carouselMapper.select(map);
	}

	public List<CarouselBean> selectByCnt(Map<String, Object> paramMap) {
		return carouselMapper.selectByCnt(paramMap);
	}

	public Integer insert(CarouselBean carouselBean) {

		Integer cnt = carouselMapper.insert(carouselBean);
		
		if(cnt > 0) {
			Integer piCnt = carouselinfoMapper.insert(carouselBean);
			return piCnt;
		}
		
		return 0;
	}

	public CarouselBean selectById(Integer caid) {
		return carouselMapper.selectById(caid);
	}

	public Integer updateById(CarouselBean carouselBean) {

		Integer cnt = carouselMapper.updateById(carouselBean);
		
		if(cnt > 0) {
			Integer piCnt = carouselinfoMapper.updateById(carouselBean);
			return piCnt;
		}
		
		return 0;
	}

	public Integer deleteById(Long caid) {

		Integer cnt = carouselMapper.deleteById(caid);
		
		if(cnt > 0) {
			Integer piCnt = carouselinfoMapper.deleteById(caid);
			return piCnt;
		}
		
		return 0;
	}

}
