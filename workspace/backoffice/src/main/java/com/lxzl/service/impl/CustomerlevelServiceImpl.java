package com.lxzl.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Customerlevel;
import com.lxzl.db.dao.CustomerlevelMapper;
import com.lxzl.service.CustomerlevelService;

@Service("customerlevelService")
public class CustomerlevelServiceImpl implements CustomerlevelService {

	@Autowired
	CustomerlevelMapper customerlevelMapper;

	@Transactional
	public Integer insertBatch(List<Customerlevel> list) {
		return customerlevelMapper.insertBatch(list);
	}

	@Transactional
	public Integer insert(Customerlevel customerlevel) {
		return customerlevelMapper.insert(customerlevel);
	}

	@Transactional
	public List<Customerlevel> select(Map<String, String> map) {
		return customerlevelMapper.select(map);
	}

}
