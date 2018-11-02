package com.lxzl.db.transfor.bean;

import java.io.Serializable;

import com.lxzl.db.bean.Company;

/**
 * @author nannan.c.wang
 *
 */
public class NewsBean implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** ID. */
	private Long nid;

	/** 公司. */
	private Long cid;

	/** 标题. */
	private String title;

	/** description. */
	private String description;

	/** 图片路径. */
	private String imgUrl;

	/**
	 * @return the nid
	 */
	public Long getNid() {
		return nid;
	}

	/**
	 * @param nid the nid to set
	 */
	public void setNid(Long nid) {
		this.nid = nid;
	}

	/**
	 * @return the cid
	 */
	public Long getCid() {
		return cid;
	}

	/**
	 * @param cid the cid to set
	 */
	public void setCid(Long cid) {
		this.cid = cid;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the imgUrl
	 */
	public String getImgUrl() {
		return imgUrl;
	}

	/**
	 * @param imgUrl the imgUrl to set
	 */
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
}
