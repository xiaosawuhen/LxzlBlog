package com.lxzl.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Customercompanyinfo;
import com.lxzl.db.dao.CustomercompanyinfoMapper;
import com.lxzl.service.CustomercompanyinfoService;

@Service("customercompanyinfoService")
public class CustomercompanyinfoServiceImpl implements CustomercompanyinfoService {

	@Autowired
	CustomercompanyinfoMapper customercompanyinfoMapper;

	@Transactional
	public Integer insertBatch(List<Customercompanyinfo> list) {
		return customercompanyinfoMapper.insertBatch(list);
	}

	@Transactional
	public Integer insert(Customercompanyinfo customercompanyinfo) {
		return customercompanyinfoMapper.insert(customercompanyinfo);
	}

	@Transactional
	public List<Customercompanyinfo> select(Map<String, String> map) {
		return customercompanyinfoMapper.select(map);
	}

}
