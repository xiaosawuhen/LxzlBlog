package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Employeelevel;

public interface EmployeelevelService {

	Integer insertBatch(List<Employeelevel> list);

	Integer insert(Employeelevel employeelevel);

	List<Employeelevel> select(Map<String, String> map);

}
