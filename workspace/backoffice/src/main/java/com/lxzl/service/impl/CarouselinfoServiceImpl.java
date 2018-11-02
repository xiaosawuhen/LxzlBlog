package com.lxzl.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Carouselinfo;
import com.lxzl.db.dao.CarouselinfoMapper;
import com.lxzl.service.CarouselinfoService;

@Service("carouselinfoService")
public class CarouselinfoServiceImpl implements CarouselinfoService {

	@Autowired
	CarouselinfoMapper carouselinfoMapper;

	@Transactional
	public Integer insertBatch(List<Carouselinfo> list) {
		return carouselinfoMapper.insertBatch(list);
	}

	@Transactional
	public List<Carouselinfo> select(Map<String, String> map) {
		return carouselinfoMapper.select(map);
	}

}
