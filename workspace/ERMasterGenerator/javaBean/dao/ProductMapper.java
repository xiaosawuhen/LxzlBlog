package com.lxzl.db.mapper;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Product;

public interface ProductMapper {
	
	List<Product> select(Map<String, String> map);

	Integer insertBatch(List<Product> list);
	
	Integer insert(Product product);
	
	Integer updateById(Product product);

	Integer deleteById(@Param("id") Integer id);
}