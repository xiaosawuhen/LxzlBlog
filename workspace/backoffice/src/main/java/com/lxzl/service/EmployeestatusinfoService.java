package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Employeestatusinfo;

public interface EmployeestatusinfoService {

	Integer insertBatch(List<Employeestatusinfo> list);

	Integer insert(Employeestatusinfo employeestatusinfo);

	List<Employeestatusinfo> select(Map<String, String> map);

}
