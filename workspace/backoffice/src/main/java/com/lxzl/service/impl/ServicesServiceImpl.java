package com.lxzl.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Services;
import com.lxzl.db.dao.ServiceinfoMapper;
import com.lxzl.db.dao.ServicesMapper;
import com.lxzl.db.transfor.bean.ServicesBean;
import com.lxzl.service.ServicesService;

@Service("servicesService")
public class ServicesServiceImpl implements ServicesService {

	@Autowired
	ServicesMapper servicesMapper;
	
	@Autowired
	ServiceinfoMapper serviceinfoMapper;

	@Transactional
	public Integer insertBatch(List<Services> list) {
		return servicesMapper.insertBatch(list);
	}

	@Transactional
	public List<Services> select(Map<String, String> map) {
		return servicesMapper.select(map);
	}

	public List<ServicesBean> selectByCnt(Map<String, Object> paramMap) {
		return servicesMapper.selectByCnt(paramMap);
	}

	@Transactional
	public Integer insert(ServicesBean servicesBean) {

		Integer cnt = servicesMapper.insert(servicesBean);
		
		if(cnt > 0) {
			Integer piCnt = serviceinfoMapper.insert(servicesBean);
			return piCnt;
		}
		
		return 0;
	}

	public ServicesBean selectById(Integer sid) {
		return servicesMapper.selectById(sid);
	}

	@Transactional
	public Integer updateById(ServicesBean servicesBean) {

		Integer cnt = servicesMapper.updateById(servicesBean);
		
		if(cnt > 0) {
			Integer piCnt = serviceinfoMapper.updateById(servicesBean);
			return piCnt;
		}
		
		return 0;
	}

	@Transactional
	public Integer deleteById(Long sid) {

		Integer cnt = servicesMapper.deleteById(sid);
		
		if(cnt > 0) {
			Integer piCnt = serviceinfoMapper.deleteById(sid);
			return piCnt;
		}
		
		return 0;
	}

}
