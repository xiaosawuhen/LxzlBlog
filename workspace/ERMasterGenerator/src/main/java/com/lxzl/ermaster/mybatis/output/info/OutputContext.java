package com.lxzl.ermaster.mybatis.output.info;

public class OutputContext {
	
	public OutputContext(String basePackage, String beanName) {
		this.beanPackage = basePackage + ".bean";
		this.mapperPackage = basePackage + ".mapper";
		this.servicePackage = basePackage + ".service";
		this.serviceImplPackage = basePackage + ".service.impl";
		
		this.beanName = beanName;
		this.tableName = this.beanName.toUpperCase();
		this.mapperName = this.beanName + "Mapper";
		this.serviceName = this.beanName + "Service";
		this.serviceImplName = this.beanName + "ServiceImpl";
		this.mappingName = this.beanName + "Mapping";
		
		this.beanSign = this.beanName.substring(0, 1).toLowerCase() + this.beanName.substring(1);
		this.mapperSign = this.mapperName.substring(0, 1).toLowerCase() + this.mapperName.substring(1);
		this.serviceSign = this.serviceName.substring(0, 1).toLowerCase() + this.serviceName.substring(1);
		this.serviceImplSign = this.serviceImplName.substring(0, 1).toLowerCase() + this.serviceImplName.substring(1);
		
		this.beanClass = this.beanPackage + "." + this.beanName;
		this.mapperClass = this.mapperPackage + "." + this.mapperName;
		this.serviceClass = this.servicePackage + "." + this.serviceName;
		this.serviceImplClass = this.serviceImplPackage + "." + this.serviceImplName;
	}

	private String tableName;
	
	private String beanPackage;
	private String beanName;
	private String beanClass;
	private String beanSign;
	
	private String mapperPackage;
	private String mapperName;
	private String mapperClass;
	private String mapperSign;
	
	private String servicePackage;
	private String serviceName;
	private String serviceClass;
	private String serviceSign;
	
	private String serviceImplPackage;
	private String serviceImplName;
	private String serviceImplClass;
	private String serviceImplSign;
	
	private String mappingName;

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getBeanPackage() {
		return beanPackage;
	}

	public void setBeanPackage(String beanPackage) {
		this.beanPackage = beanPackage;
	}

	public String getBeanName() {
		return beanName;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public String getBeanClass() {
		return beanClass;
	}

	public void setBeanClass(String beanClass) {
		this.beanClass = beanClass;
	}

	public String getBeanSign() {
		return beanSign;
	}

	public void setBeanSign(String beanSign) {
		this.beanSign = beanSign;
	}

	public String getMapperPackage() {
		return mapperPackage;
	}

	public void setMapperPackage(String mapperPackage) {
		this.mapperPackage = mapperPackage;
	}

	public String getMapperName() {
		return mapperName;
	}

	public void setMapperName(String mapperName) {
		this.mapperName = mapperName;
	}

	public String getMapperClass() {
		return mapperClass;
	}

	public void setMapperClass(String mapperClass) {
		this.mapperClass = mapperClass;
	}

	public String getMapperSign() {
		return mapperSign;
	}

	public void setMapperSign(String mapperSign) {
		this.mapperSign = mapperSign;
	}

	public String getServicePackage() {
		return servicePackage;
	}

	public void setServicePackage(String servicePackage) {
		this.servicePackage = servicePackage;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceClass() {
		return serviceClass;
	}

	public void setServiceClass(String serviceClass) {
		this.serviceClass = serviceClass;
	}

	public String getServiceSign() {
		return serviceSign;
	}

	public void setServiceSign(String serviceSign) {
		this.serviceSign = serviceSign;
	}

	public String getServiceImplPackage() {
		return serviceImplPackage;
	}

	public void setServiceImplPackage(String serviceImplPackage) {
		this.serviceImplPackage = serviceImplPackage;
	}

	public String getServiceImplName() {
		return serviceImplName;
	}

	public void setServiceImplName(String serviceImplName) {
		this.serviceImplName = serviceImplName;
	}

	public String getServiceImplClass() {
		return serviceImplClass;
	}

	public void setServiceImplClass(String serviceImplClass) {
		this.serviceImplClass = serviceImplClass;
	}

	public String getServiceImplSign() {
		return serviceImplSign;
	}

	public void setServiceImplSign(String serviceImplSign) {
		this.serviceImplSign = serviceImplSign;
	}

	public String getMappingName() {
		return mappingName;
	}

	public void setMappingName(String mappingName) {
		this.mappingName = mappingName;
	}
}
