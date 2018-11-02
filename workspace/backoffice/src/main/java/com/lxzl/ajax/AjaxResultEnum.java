package com.lxzl.ajax;

/**
 *  ajax请求枚举类
 * @author sheng.han
 *
 */
public enum AjaxResultEnum {
	SUCCESS(20000, "调用成功!"),
	FAIL(29999, "调用失败!"),
	
	// 用户相关业务 包含登录
	USERCODE_EMPTY(30000, "员工号不能为空!"),
	PASSWORD_EMPTY(30001, "密码不能为空!"),
	PASSWORD_TOO_LONG(30002, "密码不能超过10位!"),
	USER_OR_PASSWORD_INCORRECT(30003,"用户名或者密码不正确!"),
	USERNAME_TOO_LONG(30002, "用户名不能超过20位!"),
	USERNAME_EMPTY(30003, "用户名不能为空!"),
	EMAIL_EMPTY(30004, "用户名不能为空!"),
	USERCODE_TOO_LONG(30005, "员工号不能超过10位!"),
	EMAIL_TOO_LONG(30006, "邮箱不能超过50位!"),
	EMAIL_ILLEGAL(30007, "邮箱不合法!"),
	USERCODE_EXISTED(30008, "员工号已存在!"),
	EMAIL_EXISTED(30009, "邮箱已存在!"),
	USERCODE_NOT_EXISTED(30010, "员工号不存在!"),
	EMAILCODE_EMPTY(30011, "验证码不能为空!"),
	EMAILCODE_NOT_SEND(30012, "请发送验证码!"),
	EMAILCODE_NOT_CORRECT(30013, "验证码不正确,请重新输入!"),
	TASK_CREATE_EMPTY(30014, "没有匹配到相应客户!"),
	
	// 模板导入
	EXCEL_FILE_EMPTY(40001, "EXCEL文件为空!"),
	EXCEL_FILE_OR_FILE_NAME(40002, "EXCEL文件为空或文件名为空!"),
	
	// 呼入记录
	RETURN_TIME_ILLEGAL(50001, "返厂开始时间不能大于返厂结束时间!"),
	CALL_TIME_ILLEGAL(50002, "来电开始时间不能大于来电结束时间!"),
	
	// 呼出业务
	CREATE_TASK_TIME_ILLEGAL(60001, "任务创建开始时间不能大于任务创建结束时间!"),
	LAST_CALL_TIME_ILLEGAL(60002, "终次外呼开始时间不能大于终次外呼结束时间!"),
	CALL_OUT_COUNT_NOT_NUMERIC(60003, "终次外呼开始时间不能大于终次外呼结束时间!"),
	MOBILE_ILLEGAL(60004, "手机格式不正确!"),
	//呼出记录查询
	CALL_OUT_CREATE_TIME_ILLEGAL(60101, "创建开始时间不能大于创建结束时间!"),
	// 系统级别定义
	SYSTEM_ERROR(99999, "系统繁忙, 请联系管理员!");
	
	private AjaxResultEnum(int statusCode, String message) {
		this.statusCode = statusCode;
		this.message = message;
	}
	
	/**
	 *  返回码
	 */
	private int statusCode;

	/**
	 *  返回信息
	 */
	private String message;

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
}
