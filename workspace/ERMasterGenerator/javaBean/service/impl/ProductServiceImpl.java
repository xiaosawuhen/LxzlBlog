package com.lxzl.db.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Product;
import com.lxzl.db.mapper.ProductMapper;
import com.lxzl.db.service.ProductService;

@Service("productService")
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductMapper productMapper;
	
	public List<Product> select(Map<String, String> map) {
		return productMapper.select(map);
	}

	@Transactional
	public Integer insertBatch(List<ProductMapper> list) {
		return productMapper.insertBatch(list);
	}
	
	@Transactional
	public Integer insert(Product product) {
		return productMapper.insert(product);
	}
	
	@Transactional
	public Integer updateById(Product product) {
		return productMapper.updateById(product);
	}
	
	@Transactional
	public Integer deleteById(Integer id) {
		return productMapper.deleteById(list);
	}
}