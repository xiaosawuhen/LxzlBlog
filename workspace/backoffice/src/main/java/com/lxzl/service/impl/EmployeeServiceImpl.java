package com.lxzl.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Employee;
import com.lxzl.db.dao.CompanyemployeeinfoMapper;
import com.lxzl.db.dao.EmployeeMapper;
import com.lxzl.db.dao.EmployeeinfoMapper;
import com.lxzl.db.transfor.bean.EmployeeBean;
import com.lxzl.service.CompanyemployeeinfoService;
import com.lxzl.service.EmployeeService;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeMapper employeeMapper;

	@Autowired
	EmployeeinfoMapper employeeinfoMapper;
	
	@Autowired
	CompanyemployeeinfoMapper companyemployeeinfoMapper;

	@Transactional
	public Integer insertBatch(List<EmployeeBean> list) {
		return employeeMapper.insertBatch(list);
	}

	@Transactional
	public List<Employee> select(Map<String, String> map) {
		return employeeMapper.select(map);
	}

	public List<EmployeeBean> selectByCnt(Map<String, Object> paramMap) {
		return employeeMapper.selectByCnt(paramMap);
	}

	public EmployeeBean selectById(Integer eid) {
		return employeeMapper.selectById(eid);
	}

	@Transactional
	public Integer updateById(EmployeeBean employeeBean) {
		Integer cnt = employeeMapper.updateById(employeeBean);
		
		if(cnt > 0) {
			Integer eiCnt = employeeinfoMapper.updateById(employeeBean);
			return eiCnt;
		}
		
		return 0;
	}

	@Transactional
	public Integer insert(EmployeeBean employeeBean, Long cid) {
		Integer cnt = employeeMapper.insert(employeeBean);
		
		if(cnt > 0) {
			Integer ceiCnt = companyemployeeinfoMapper.insertByEidCid(employeeBean.getEid(), cid);
			
			Integer eiCnt = employeeinfoMapper.insert(employeeBean);
			return eiCnt;
		}
		
		return 0;
	}

	public Integer deleteById(Long eid) {
		Integer cnt = employeeMapper.deleteById(eid);
		
		if(cnt > 0) {
			Integer eiCnt = employeeinfoMapper.deleteById(eid);
			return eiCnt;
		}
		
		return 0;
	}

}
