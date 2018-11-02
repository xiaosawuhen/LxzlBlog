package com.cn.db.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.db.bean.Customerlevelinfo;
import com.cn.db.mapper.CustomerlevelinfoMapper;
import com.cn.db.service.CustomerlevelinfoService;

@Service("customerlevelinfoService")
public class CustomerlevelinfoServiceImpl implements CustomerlevelinfoService{
	
	@Autowired
	CustomerlevelinfoMapper customerlevelinfoMapper;
	
	public List<Customerlevelinfo> select(Map<String, String> map) {
		return customerlevelinfoMapper.select(map);
	}

	@Transactional
	public Integer insertBatch(List<CustomerlevelinfoMapper> list) {
		return customerlevelinfoMapper.insertBatch(list);
	}
	
	@Transactional
	public Integer insert(Customerlevelinfo customerlevelinfo) {
		return customerlevelinfoMapper.insert(customerlevelinfo);
	}
	
	@Transactional
	public Integer updateById(Customerlevelinfo customerlevelinfo) {
		return customerlevelinfoMapper.updateById(customerlevelinfo);
	}
	
	@Transactional
	public Integer deleteById(Integer id) {
		return customerlevelinfoMapper.deleteById(list);
	}
}