package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Company;
import com.lxzl.db.transfor.bean.CompanyBean;

public interface CompanyService {

	Integer insertBatch(List<Company> list);

	Integer insert(Company company);

	List<Company> select(Map<String, String> map);

	CompanyBean getInfoByName(String name);

	Integer insert(CompanyBean company);

	Integer updateById(CompanyBean company);

	CompanyBean selectById(Long id);

	Company selectByUserName(String username);
}
