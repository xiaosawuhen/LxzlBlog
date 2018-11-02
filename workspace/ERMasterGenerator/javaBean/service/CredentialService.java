package com.lxzl.db.service;

import java.util.List;
import com.lxzl.db.bean.Credential;

public interface CredentialService{

	Integer insertBatch(List<Credential> list);
	
	Integer insert(Credential credential);
	
	List<Credential> select(Map<String, String> map);
	
	Integer updateById(Credential credential);
	
	Integer deleteById(@Param("id") Integer id);
	
}