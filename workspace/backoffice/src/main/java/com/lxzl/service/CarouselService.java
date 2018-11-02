package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Carousel;
import com.lxzl.db.transfor.bean.CarouselBean;

public interface CarouselService {

	Integer insertBatch(List<Carousel> list);

	List<Carousel> select(Map<String, String> map);

	List<CarouselBean> selectByCnt(Map<String, Object> paramMap);

	Integer insert(CarouselBean carouselBean);

	CarouselBean selectById(Integer pid);

	Integer updateById(CarouselBean carouselBean);

	Integer deleteById(Long caid);

}
