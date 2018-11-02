package com.lxzl.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.News;
import com.lxzl.db.dao.NewsMapper;
import com.lxzl.db.dao.NewsinfoMapper;
import com.lxzl.db.transfor.bean.NewsBean;
import com.lxzl.service.NewsService;

@Service("newsService")
public class NewsServiceImpl implements NewsService {

	@Autowired
	NewsMapper newsMapper;
	
	@Autowired
	NewsinfoMapper newsinfoMapper;

	@Transactional
	public Integer insertBatch(List<News> list) {
		return newsMapper.insertBatch(list);
	}

	@Transactional
	public List<News> select(Map<String, String> map) {
		return newsMapper.select(map);
	}

	public List<NewsBean> selectByCnt(Map<String, Object> paramMap) {
		return newsMapper.selectByCnt(paramMap);
	}

	@Transactional
	public Integer insert(NewsBean newsBean) {

		Integer cnt = newsMapper.insert(newsBean);
		
		if(cnt > 0) {
			Integer piCnt = newsinfoMapper.insert(newsBean);
			return piCnt;
		}
		
		return 0;
	}

	public NewsBean selectById(Integer nid) {
		return newsMapper.selectById(nid);
	}

	@Transactional
	public Integer updateById(NewsBean newsBean) {

		Integer cnt = newsMapper.updateById(newsBean);
		
		if(cnt > 0) {
			Integer piCnt = newsinfoMapper.updateById(newsBean);
			return piCnt;
		}
		
		return 0;
	}

	@Transactional
	public Integer deleteById(Long nid) {

		Integer cnt = newsMapper.deleteById(nid);
		
		if(cnt > 0) {
			Integer piCnt = newsinfoMapper.deleteById(nid);
			return piCnt;
		}
		
		return 0;
	}

}
