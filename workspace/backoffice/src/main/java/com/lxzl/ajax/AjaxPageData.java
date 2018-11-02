package com.lxzl.ajax;

import java.io.Serializable;

/**
 *  返回前端处理
 *  必须赋值字段为 total, pageNo, limit
 *  然后调用ValidateUtil#calculatePageInfo做计算即可
 * @author sheng.han
 *
 */
@SuppressWarnings("serial")
public class AjaxPageData implements Serializable {

	/**
	 *  上一页是否可用
	 *  0 无可用 1 可用
	 */
	private Integer prePageEnable = 0;
	
	/**
	 *  下一页是否可用
	 *  0 无可用 1 可用
	 */
	private Integer nextPageEnable = 0;
	
	/**
	 *  当前页码
	 */
	private Integer pageNo = 1;
	
	/**
	 *  总记录数
	 */
	private Integer total;
	
	/**
	 *  总页码
	 */
	private Integer pages;
	
	/**
	 *  每页最大记录数
	 */
	private Integer limit = 10;

	public Integer getPrePageEnable() {
		return prePageEnable;
	}

	public void setPrePageEnable(Integer prePageEnable) {
		this.prePageEnable = prePageEnable;
	}

	public Integer getNextPageEnable() {
		return nextPageEnable;
	}

	public void setNextPageEnable(Integer nextPageEnable) {
		this.nextPageEnable = nextPageEnable;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	
}
