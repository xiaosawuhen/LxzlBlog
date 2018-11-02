package com.lxzl.intercptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.lxzl.constant.SessionConstant;
import com.lxzl.db.bean.Company;
import com.lxzl.service.CompanyService;

public class SessionAttributeInterceptor implements HandlerInterceptor {

	@Autowired
	private CompanyService companyService;
	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		String username = (String) request.getSession().getAttribute(SessionConstant.USER_NAME);// 登录名
		Company company = companyService.selectByUserName(username);

		if (company != null) {
			request.getSession().setAttribute(SessionConstant.COMPANY_ID, company.getCid());
		}
		
		return true;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		response.setHeader("X-Frame-Options", "SAMEORIGIN");// 解决IFrame拒绝的问题 
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
	}

}
