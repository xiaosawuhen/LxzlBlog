package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Services;
import com.lxzl.db.transfor.bean.ServicesBean;

public interface ServicesService {

	Integer insertBatch(List<Services> list);

	List<Services> select(Map<String, String> map);

	List<ServicesBean> selectByCnt(Map<String, Object> paramMap);

	Integer insert(ServicesBean servicesBean);

	ServicesBean selectById(Integer sid);

	Integer updateById(ServicesBean servicesBean);

	Integer deleteById(Long sid);

}
