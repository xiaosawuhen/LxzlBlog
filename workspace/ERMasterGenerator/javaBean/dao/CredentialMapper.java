package com.lxzl.db.mapper;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Credential;

public interface CredentialMapper {
	
	List<Credential> select(Map<String, String> map);

	Integer insertBatch(List<Credential> list);
	
	Integer insert(Credential credential);
	
	Integer updateById(Credential credential);

	Integer deleteById(@Param("id") Integer id);
}