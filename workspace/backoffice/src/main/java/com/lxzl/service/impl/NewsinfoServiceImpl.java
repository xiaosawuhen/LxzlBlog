package com.lxzl.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Newsinfo;
import com.lxzl.db.dao.NewsinfoMapper;
import com.lxzl.service.NewsinfoService;

@Service("newsinfoService")
public class NewsinfoServiceImpl implements NewsinfoService {

	@Autowired
	NewsinfoMapper newsinfoMapper;

	@Transactional
	public Integer insertBatch(List<Newsinfo> list) {
		return newsinfoMapper.insertBatch(list);
	}

	@Transactional
	public List<Newsinfo> select(Map<String, String> map) {
		return newsinfoMapper.select(map);
	}

}
