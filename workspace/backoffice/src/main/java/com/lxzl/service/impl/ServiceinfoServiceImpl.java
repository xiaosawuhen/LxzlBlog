package com.lxzl.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Serviceinfo;
import com.lxzl.db.dao.ServiceinfoMapper;
import com.lxzl.service.ServiceinfoService;

@Service("serviceinfoService")
public class ServiceinfoServiceImpl implements ServiceinfoService {

	@Autowired
	ServiceinfoMapper serviceinfoMapper;

	@Transactional
	public Integer insertBatch(List<Serviceinfo> list) {
		return serviceinfoMapper.insertBatch(list);
	}

	@Transactional
	public List<Serviceinfo> select(Map<String, String> map) {
		return serviceinfoMapper.select(map);
	}

}
