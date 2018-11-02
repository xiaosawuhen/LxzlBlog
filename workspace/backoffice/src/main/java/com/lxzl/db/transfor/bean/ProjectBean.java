package com.lxzl.db.transfor.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * @author nannan.c.wang
 *
 */
public class ProjectBean implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** PID. */
	private Long pid;

	/** CID. */
	private Long cid;

	/** �??称. */
	private String name;

	/** �??述. */
	private String description;

	private String imgUrl;
	
	/** 开始时间. */
	private Date startTime;
	
	private String startTimeStr;

	/** 结�?�时间. */
	private Date endTime;
	
	private String endTimeStr;

	/**
	 * @return the pid
	 */
	public Long getPid() {
		return pid;
	}

	/**
	 * @param pid the pid to set
	 */
	public void setPid(Long pid) {
		this.pid = pid;
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
	 * @return the startTime
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return the endTime
	 */
	public Date getEndTime() {
		return endTime;
	}

	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	/**
	 * @return the startTimeStr
	 */
	public String getStartTimeStr() {
		return startTimeStr;
	}

	/**
	 * @param startTimeStr the startTimeStr to set
	 */
	public void setStartTimeStr(String startTimeStr) {
		this.startTimeStr = startTimeStr;
	}

	/**
	 * @return the endTimeStr
	 */
	public String getEndTimeStr() {
		return endTimeStr;
	}

	/**
	 * @param endTimeStr the endTimeStr to set
	 */
	public void setEndTimeStr(String endTimeStr) {
		this.endTimeStr = endTimeStr;
	}
}
