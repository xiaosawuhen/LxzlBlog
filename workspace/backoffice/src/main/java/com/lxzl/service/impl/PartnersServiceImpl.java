package com.lxzl.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Partners;
import com.lxzl.db.dao.PartnerinfoMapper;
import com.lxzl.db.dao.PartnersMapper;
import com.lxzl.db.transfor.bean.PartnerBean;
import com.lxzl.service.PartnersService;

@Service("partnersService")
public class PartnersServiceImpl implements PartnersService {

	@Autowired
	PartnersMapper partnersMapper;
	
	@Autowired
	PartnerinfoMapper partnerinfoMapper;

	@Transactional
	public Integer insertBatch(List<Partners> list) {
		return partnersMapper.insertBatch(list);
	}

	@Transactional
	public List<Partners> select(Map<String, String> map) {
		return partnersMapper.select(map);
	}

	public List<PartnerBean> selectByCnt(Map<String, Object> paramMap) {
		return partnersMapper.selectByCnt(paramMap);
	}

	@Transactional
	public Integer insert(PartnerBean partnerBean) {

		Integer cnt = partnersMapper.insert(partnerBean);
		
		if(cnt > 0) {
			Integer piCnt = partnerinfoMapper.insert(partnerBean);
			return piCnt;
		}
		
		return 0;
	}

	public PartnerBean selectById(Integer pid) {
		return partnersMapper.selectById(pid);
	}

	@Transactional
	public Integer updateById(PartnerBean partnerBean) {

		Integer cnt = partnersMapper.updateById(partnerBean);
		
		if(cnt > 0) {
			Integer piCnt = partnerinfoMapper.updateById(partnerBean);
			return piCnt;
		}
		
		return 0;
	}

	@Transactional
	public Integer deleteById(Long pid) {

		Integer cnt = partnersMapper.deleteById(pid);
		
		if(cnt > 0) {
			Integer piCnt = partnerinfoMapper.deleteById(pid);
			return piCnt;
		}
		
		return 0;
	}

}
