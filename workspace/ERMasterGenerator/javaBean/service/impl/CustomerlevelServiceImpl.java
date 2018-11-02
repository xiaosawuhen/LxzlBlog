package com.cn.db.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.db.bean.Customerlevel;
import com.cn.db.mapper.CustomerlevelMapper;
import com.cn.db.service.CustomerlevelService;

@Service("customerlevelService")
public class CustomerlevelServiceImpl implements CustomerlevelService{
	
	@Autowired
	CustomerlevelMapper customerlevelMapper;
	
	public List<Customerlevel> select(Map<String, String> map) {
		return customerlevelMapper.select(map);
	}

	@Transactional
	public Integer insertBatch(List<CustomerlevelMapper> list) {
		return customerlevelMapper.insertBatch(list);
	}
	
	@Transactional
	public Integer insert(Customerlevel customerlevel) {
		return customerlevelMapper.insert(customerlevel);
	}
	
	@Transactional
	public Integer updateById(Customerlevel customerlevel) {
		return customerlevelMapper.updateById(customerlevel);
	}
	
	@Transactional
	public Integer deleteById(Integer id) {
		return customerlevelMapper.deleteById(list);
	}
}