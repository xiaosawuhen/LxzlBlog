package com.lxzl.db.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Credential;
import com.lxzl.db.mapper.CredentialMapper;
import com.lxzl.db.service.CredentialService;

@Service("credentialService")
public class CredentialServiceImpl implements CredentialService{
	
	@Autowired
	CredentialMapper credentialMapper;
	
	public List<Credential> select(Map<String, String> map) {
		return credentialMapper.select(map);
	}

	@Transactional
	public Integer insertBatch(List<CredentialMapper> list) {
		return credentialMapper.insertBatch(list);
	}
	
	@Transactional
	public Integer insert(Credential credential) {
		return credentialMapper.insert(credential);
	}
	
	@Transactional
	public Integer updateById(Credential credential) {
		return credentialMapper.updateById(credential);
	}
	
	@Transactional
	public Integer deleteById(Integer id) {
		return credentialMapper.deleteById(list);
	}
}