package com.lxzl.db.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Newsinfo;
import com.lxzl.db.mapper.NewsinfoMapper;
import com.lxzl.db.service.NewsinfoService;

@Service("newsinfoService")
public class NewsinfoServiceImpl implements NewsinfoService{
	
	@Autowired
	NewsinfoMapper newsinfoMapper;
	
	public List<Newsinfo> select(Map<String, String> map) {
		return newsinfoMapper.select(map);
	}

	@Transactional
	public Integer insertBatch(List<NewsinfoMapper> list) {
		return newsinfoMapper.insertBatch(list);
	}
	
	@Transactional
	public Integer insert(Newsinfo newsinfo) {
		return newsinfoMapper.insert(newsinfo);
	}
	
	@Transactional
	public Integer updateById(Newsinfo newsinfo) {
		return newsinfoMapper.updateById(newsinfo);
	}
	
	@Transactional
	public Integer deleteById(Integer id) {
		return newsinfoMapper.deleteById(list);
	}
}