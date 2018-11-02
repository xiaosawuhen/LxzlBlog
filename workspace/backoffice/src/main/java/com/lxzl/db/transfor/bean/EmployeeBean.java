package com.lxzl.db.transfor.bean;

import java.io.Serializable;

/**
 * @author nannan.c.wang
 *
 */
public class EmployeeBean implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 员工ID. */
	private Long eid;

	/** alias_name. */
	private String aliasName;

	/** 密�?. */
	private String password;

	/** 手机�?�. */
	private String phone;

	/** 邮箱. */
	private String email;
	
	/**
	 * 图片路径
	 */
	private String imgUrl;

	/** 姓�??. */
	private String name;

	/** 年龄. */
	private Integer age;

	/** 性别. */
	private String sex;

	/**
	 * @return the eid
	 */
	public Long getEid() {
		return eid;
	}

	/**
	 * @param eid the eid to set
	 */
	public void setEid(Long eid) {
		this.eid = eid;
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
	 * @return the aliasName
	 */
	public String getAliasName() {
		return aliasName;
	}

	/**
	 * @param aliasName the aliasName to set
	 */
	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
