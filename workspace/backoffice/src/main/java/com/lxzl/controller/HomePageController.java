package com.lxzl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lxzl.db.transfor.bean.CompanyBean;
import com.lxzl.service.CompanyService;

@Controller
@RequestMapping("/index")
public class HomePageController {

	@Autowired
	private CompanyService companyService;
	
	@RequestMapping
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();
		
		Long id = 18L;
		CompanyBean company = companyService.selectById(id);
		mv.addObject("company", company);
		
		mv.setViewName("company/index");
		return mv;
	}
	
}
