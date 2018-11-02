package com.lxzl.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Customerestimatelevel;
import com.lxzl.db.dao.CustomerestimatelevelMapper;
import com.lxzl.service.CustomerestimatelevelService;

@Service("customerestimatelevelService")
public class CustomerestimatelevelServiceImpl implements CustomerestimatelevelService {

	@Autowired
	CustomerestimatelevelMapper customerestimatelevelMapper;

	@Transactional
	public Integer insertBatch(List<Customerestimatelevel> list) {
		return customerestimatelevelMapper.insertBatch(list);
	}

	@Transactional
	public Integer insert(Customerestimatelevel customerestimatelevel) {
		return customerestimatelevelMapper.insert(customerestimatelevel);
	}

	@Transactional
	public List<Customerestimatelevel> select(Map<String, String> map) {
		return customerestimatelevelMapper.select(map);
	}

}
