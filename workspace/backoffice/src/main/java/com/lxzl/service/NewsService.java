package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.News;
import com.lxzl.db.transfor.bean.NewsBean;

public interface NewsService {

	Integer insertBatch(List<News> list);

	List<News> select(Map<String, String> map);

	List<NewsBean> selectByCnt(Map<String, Object> paramMap);

	Integer insert(NewsBean newsBean);

	NewsBean selectById(Integer nid);

	Integer updateById(NewsBean newsBean);

	Integer deleteById(Long nid);

}
