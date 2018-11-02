package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Employeelevelinfo;

public interface EmployeelevelinfoService {

	Integer insertBatch(List<Employeelevelinfo> list);

	Integer insert(Employeelevelinfo employeelevelinfo);

	List<Employeelevelinfo> select(Map<String, String> map);

}
