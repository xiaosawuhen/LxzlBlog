package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Companyemployeeinfo;

public interface CompanyemployeeinfoService {

	Integer insertBatch(List<Companyemployeeinfo> list);

	Integer insert(Companyemployeeinfo companyemployeeinfo);

	List<Companyemployeeinfo> select(Map<String, String> map);

}
