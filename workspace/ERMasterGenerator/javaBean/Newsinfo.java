package com.lxzl.db.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Model class of 新闻详细表.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Newsinfo implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** ID. */
	private Long niid;

	/** 新闻表. */
	private News news;

	/** 图片路径. */
	private String imgUrl;

	/** 创建日期. */
	private Date createTime;

	/** 更新日期. */
	private Date updateTime;

	/**
	 * Constructor.
	 */
	public Newsinfo() {
	}

	/**
	 * Set the ID.
	 * 
	 * @param niid
	 *            ID
	 */
	public void setNiid(Long niid) {
		this.niid = niid;
	}

	/**
	 * Get the ID.
	 * 
	 * @return ID
	 */
	public Long getNiid() {
		return this.niid;
	}

	/**
	 * Set the 新闻表.
	 * 
	 * @param news
	 *            新闻表
	 */
	public void setNews(News news) {
		this.news = news;
	}

	/**
	 * Get the 新闻表.
	 * 
	 * @return 新闻表
	 */
	public News getNews() {
		return this.news;
	}

	/**
	 * Set the 图片路径.
	 * 
	 * @param imgUrl
	 *            图片路径
	 */
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	/**
	 * Get the 图片路径.
	 * 
	 * @return 图片路径
	 */
	public String getImgUrl() {
		return this.imgUrl;
	}

	/**
	 * Set the 创建日期.
	 * 
	 * @param createTime
	 *            创建日期
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * Get the 创建日期.
	 * 
	 * @return 创建日期
	 */
	public Date getCreateTime() {
		return this.createTime;
	}

	/**
	 * Set the 更新日期.
	 * 
	 * @param updateTime
	 *            更新日期
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * Get the 更新日期.
	 * 
	 * @return 更新日期
	 */
	public Date getUpdateTime() {
		return this.updateTime;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((niid == null) ? 0 : niid.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Newsinfo other = (Newsinfo) obj;
		if (niid == null) {
			if (other.niid != null) {
				return false;
			}
		} else if (!niid.equals(other.niid)) {
			return false;
		}
		return true;
	}

}
