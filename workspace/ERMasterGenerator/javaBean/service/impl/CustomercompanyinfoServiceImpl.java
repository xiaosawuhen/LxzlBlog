package com.cn.db.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.db.bean.Customercompanyinfo;
import com.cn.db.mapper.CustomercompanyinfoMapper;
import com.cn.db.service.CustomercompanyinfoService;

@Service("customercompanyinfoService")
public class CustomercompanyinfoServiceImpl implements CustomercompanyinfoService{
	
	@Autowired
	CustomercompanyinfoMapper customercompanyinfoMapper;
	
	public List<Customercompanyinfo> select(Map<String, String> map) {
		return customercompanyinfoMapper.select(map);
	}

	@Transactional
	public Integer insertBatch(List<CustomercompanyinfoMapper> list) {
		return customercompanyinfoMapper.insertBatch(list);
	}
	
	@Transactional
	public Integer insert(Customercompanyinfo customercompanyinfo) {
		return customercompanyinfoMapper.insert(customercompanyinfo);
	}
	
	@Transactional
	public Integer updateById(Customercompanyinfo customercompanyinfo) {
		return customercompanyinfoMapper.updateById(customercompanyinfo);
	}
	
	@Transactional
	public Integer deleteById(Integer id) {
		return customercompanyinfoMapper.deleteById(list);
	}
}