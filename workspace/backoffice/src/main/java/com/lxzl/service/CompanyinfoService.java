package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Companyinfo;
import com.lxzl.db.transfor.bean.CompanyBean;

public interface CompanyinfoService {

	Integer insertBatch(List<Companyinfo> list);

	Integer insert(CompanyBean companyinfo);

	List<Companyinfo> select(Map<String, String> map);

}
