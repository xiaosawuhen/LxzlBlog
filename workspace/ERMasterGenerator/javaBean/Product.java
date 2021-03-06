package com.lxzl.db.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Model class of 产品.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Product implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** ID. */
	private Long pid;

	/** 公司. */
	private Company company;

	/** 名称. */
	private String name;

	/** 简单描述. */
	private String shortDescription;

	/** 描述. */
	private String description;

	/** remark01. */
	private String remark01;

	/** remark02. */
	private String remark02;

	/** 创建日期. */
	private Date createTime;

	/** 更新日期. */
	private Date updateTime;

	/** The set of 产品详细. */
	private Set<Productinfo> productinfoSet;

	/**
	 * Constructor.
	 */
	public Product() {
		this.productinfoSet = new HashSet<Productinfo>();
	}

	/**
	 * Set the ID.
	 * 
	 * @param pid
	 *            ID
	 */
	public void setPid(Long pid) {
		this.pid = pid;
	}

	/**
	 * Get the ID.
	 * 
	 * @return ID
	 */
	public Long getPid() {
		return this.pid;
	}

	/**
	 * Set the 公司.
	 * 
	 * @param company
	 *            公司
	 */
	public void setCompany(Company company) {
		this.company = company;
	}

	/**
	 * Get the 公司.
	 * 
	 * @return 公司
	 */
	public Company getCompany() {
		return this.company;
	}

	/**
	 * Set the 名称.
	 * 
	 * @param name
	 *            名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the 名称.
	 * 
	 * @return 名称
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Set the 简单描述.
	 * 
	 * @param shortDescription
	 *            简单描述
	 */
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	/**
	 * Get the 简单描述.
	 * 
	 * @return 简单描述
	 */
	public String getShortDescription() {
		return this.shortDescription;
	}

	/**
	 * Set the 描述.
	 * 
	 * @param description
	 *            描述
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Get the 描述.
	 * 
	 * @return 描述
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Set the remark01.
	 * 
	 * @param remark01
	 *            remark01
	 */
	public void setRemark01(String remark01) {
		this.remark01 = remark01;
	}

	/**
	 * Get the remark01.
	 * 
	 * @return remark01
	 */
	public String getRemark01() {
		return this.remark01;
	}

	/**
	 * Set the remark02.
	 * 
	 * @param remark02
	 *            remark02
	 */
	public void setRemark02(String remark02) {
		this.remark02 = remark02;
	}

	/**
	 * Get the remark02.
	 * 
	 * @return remark02
	 */
	public String getRemark02() {
		return this.remark02;
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
	 * Set the set of the 产品详细.
	 * 
	 * @param productinfoSet
	 *            The set of 产品详细
	 */
	public void setProductinfoSet(Set<Productinfo> productinfoSet) {
		this.productinfoSet = productinfoSet;
	}

	/**
	 * Add the 产品详细.
	 * 
	 * @param productinfo
	 *            产品详细
	 */
	public void addProductinfo(Productinfo productinfo) {
		this.productinfoSet.add(productinfo);
	}

	/**
	 * Get the set of the 产品详细.
	 * 
	 * @return The set of 产品详细
	 */
	public Set<Productinfo> getProductinfoSet() {
		return this.productinfoSet;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pid == null) ? 0 : pid.hashCode());
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
		Product other = (Product) obj;
		if (pid == null) {
			if (other.pid != null) {
				return false;
			}
		} else if (!pid.equals(other.pid)) {
			return false;
		}
		return true;
	}

}
