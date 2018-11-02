package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Employee;
import com.lxzl.db.transfor.bean.EmployeeBean;

public interface EmployeeService {

	Integer insertBatch(List<EmployeeBean> list);

	List<Employee> select(Map<String, String> map);

	List<EmployeeBean> selectByCnt(Map<String, Object> paramMap);

	EmployeeBean selectById(Integer eid);

	Integer updateById(EmployeeBean employeeBean);

	Integer insert(EmployeeBean employeeBean, Long cid);

	Integer deleteById(Long long1);

}
