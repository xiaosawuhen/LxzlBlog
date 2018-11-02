package com.lxzl.ermaster.mybatis.output.factory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lxzl.ermaster.mybatis.bean.BeanInfo;
import com.lxzl.ermaster.mybatis.bean.BeanProperty;
import com.lxzl.ermaster.mybatis.output.info.OutputContext;
import com.lxzl.ermaster.mybatis.output.info.OutputPath;

public class OutputContextFactory {

	public OutputContextFactory(BeanInfo beanInfo, String basePath) {
		String beanPackage = beanInfo.get_package();
		this.basePackage = beanPackage.substring(0, beanPackage.lastIndexOf("."));
		this.beanName = beanInfo.getName();
		this.basePath = basePath;
		
		this.outputContext = new OutputContext(basePackage, beanName);
		this.outputPath = new OutputPath(basePath, beanName);
		this.propertyList = beanInfo.getPropertyList();
	}
	
	private String basePackage;
	private String basePath;
	private String beanName;
	
	private OutputContext outputContext;
	private OutputPath outputPath;

	private List<BeanProperty> propertyList;

	public List<BeanProperty> getPropertyList() {
		return propertyList;
	}

	public void setPropertyList(List<BeanProperty> propertyList) {
		this.propertyList = propertyList;
	}

	public String getBasePackage() {
		return basePackage;
	}

	public void setBasePackage(String basePackage) {
		this.basePackage = basePackage;
	}

	public String getBasePath() {
		return basePath;
	}

	public void setBasePath(String basePath) {
		this.basePath = basePath;
	}

	public String getBeanName() {
		return beanName;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public OutputContext getOutputContext() {
		return outputContext;
	}

	public void setOutputContext(OutputContext outputContext) {
		this.outputContext = outputContext;
	}

	public OutputPath getOutputPath() {
		return outputPath;
	}

	public void setOutputPath(OutputPath outputPath) {
		this.outputPath = outputPath;
	}

	public Map<String, Object> getContext() {
		Map<String, Object> ctx = new HashMap<>();
		ctx.put("info", this.outputContext);
		ctx.put("propertyList", this.propertyList);
		
		return ctx;
	}
}
