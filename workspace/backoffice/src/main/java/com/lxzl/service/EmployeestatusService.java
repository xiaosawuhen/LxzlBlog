package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Employeestatus;

public interface EmployeestatusService {

	Integer insertBatch(List<Employeestatus> list);

	Integer insert(Employeestatus employeestatus);

	List<Employeestatus> select(Map<String, String> map);

}
