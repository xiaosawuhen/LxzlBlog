package com.lxzl.db.transfor.bean;

import java.io.Serializable;
import java.util.Date;

public class CredentialBean implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** ID. */
	private Long crid;
	
	/** 公司. */
	private Long cid;

	/** 名称. */
	private String name;

	/** 图片路径. */
	private String imgUrl;

	/** 描述. */
	private String description;

	/** 到期日. */
	private Date endDate;
	
	private String endDateStr;

	
	/**
	 * @return the crid
	 */
	public Long getCrid() {
		return crid;
	}

	/**
	 * @param crid the crid to set
	 */
	public void setCrid(Long crid) {
		this.crid = crid;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the endDateStr
	 */
	public String getEndDateStr() {
		return endDateStr;
	}

	/**
	 * @param endDateStr the endDateStr to set
	 */
	public void setEndDateStr(String endDateStr) {
		this.endDateStr = endDateStr;
	}
	
}
