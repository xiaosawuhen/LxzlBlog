package com.lxzl.ajax;

import java.io.Serializable;

/**
 *  ajax请求结果封装
 * @author sheng.han
 * @param <T>
 *
 */
@SuppressWarnings("serial")
public class AjaxResultData<T> implements Serializable {

	public AjaxResultData(AjaxResultEnum enumData, T data) {
		super();
		this.data = data;
		
		if (enumData == AjaxResultEnum.SUCCESS) {
			this.isSuccessful = true;
		}
		
		// 赋值
		this.statusCode = enumData.getStatusCode();
		this.message = enumData.getMessage();
	}
	
	public AjaxResultData(AjaxResultEnum enumData, T data, AjaxPageData page) {
		this(enumData, data);
		this.page = page;
	}

	/**
	 *  调用是否成功
	 */
	private boolean isSuccessful;
	
	/**
	 *  返回码
	 */
	private int statusCode;
	
	/**
	 *  返回信息
	 */
	private String message;
	
	/**
	 *  数据实体
	 */
	private T data;
	
	/**
	 *  分页信息
	 */
	private AjaxPageData page;

	public boolean isSuccessful() {
		return isSuccessful;
	}

	public void setSuccessful(boolean isSuccessful) {
		this.isSuccessful = isSuccessful;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public AjaxPageData getPage() {
		return page;
	}

	public void setPage(AjaxPageData page) {
		this.page = page;
	}
}
