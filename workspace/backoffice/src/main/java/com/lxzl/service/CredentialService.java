package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Credential;
import com.lxzl.db.transfor.bean.CredentialBean;

public interface CredentialService {

	Integer insertBatch(List<Credential> list);

	List<Credential> select(Map<String, String> map);

	List<CredentialBean> selectByCnt(Map<String, Object> paramMap);

	Integer insert(CredentialBean credentialBean);

	CredentialBean selectById(Long crid);

	Integer updateById(CredentialBean credentialBean);

	Integer deleteById(Integer crid);
}
