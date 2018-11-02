package com.lxzl.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lxzl.constant.SessionConstant;
import com.lxzl.db.bean.Company;
import com.lxzl.service.CompanyService;

@Controller
public class LoginController {

	@Autowired
	private CompanyService companyService;

	@RequestMapping("/login")
	public String login(HttpServletRequest request) {

		return "login";
	}

}
