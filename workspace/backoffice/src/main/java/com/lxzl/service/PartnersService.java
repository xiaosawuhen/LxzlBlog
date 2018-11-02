package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Partners;
import com.lxzl.db.transfor.bean.PartnerBean;

public interface PartnersService {

	Integer insertBatch(List<Partners> list);

	List<Partners> select(Map<String, String> map);

	List<PartnerBean> selectByCnt(Map<String, Object> paramMap);

	Integer insert(PartnerBean partnerBean);

	PartnerBean selectById(Integer pid);

	Integer updateById(PartnerBean partnerBean);

	Integer deleteById(Long pid);

}
