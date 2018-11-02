package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Employeeinfo;
import com.lxzl.db.transfor.bean.EmployeeBean;

public interface EmployeeinfoService {

	Integer insertBatch(List<EmployeeBean> list);

	Integer insert(EmployeeBean employeeinfo);

	List<Employeeinfo> select(Map<String, String> map);

	Employeeinfo selectByAliasName(String username);
}
