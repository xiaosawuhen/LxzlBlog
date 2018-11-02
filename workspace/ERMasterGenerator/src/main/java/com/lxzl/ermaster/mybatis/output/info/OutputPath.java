package com.lxzl.ermaster.mybatis.output.info;

public class OutputPath {

	public OutputPath(String basePath, String beanName) {
		String mapperName = beanName + "Mapper";
		String serviceName = beanName + "Service";
		String serviceImplName = beanName + "ServiceImpl";
		String mappingName = beanName + "Mapping";

		this.beanPath = basePath + "/bean/" + beanName + ".java";
		this.mappingPath = basePath + "/mapping/" + mappingName + ".xml";
		this.servicePath = basePath + "/service/" + serviceName + ".java";
		this.serviceImplPath = basePath + "/service/impl/" + serviceImplName + ".java";
		this.mapperPath = basePath + "/dao/" + mapperName + ".java";
	}
	
	private String beanPath;
	private String mapperPath;
	private String servicePath;
	private String serviceImplPath;
	private String mappingPath;
	public String getBeanPath() {
		return beanPath;
	}
	public void setBeanPath(String beanPath) {
		this.beanPath = beanPath;
	}
	public String getMapperPath() {
		return mapperPath;
	}
	public void setMapperPath(String mapperPath) {
		this.mapperPath = mapperPath;
	}
	public String getServicePath() {
		return servicePath;
	}
	public void setServicePath(String servicePath) {
		this.servicePath = servicePath;
	}
	public String getServiceImplPath() {
		return serviceImplPath;
	}
	public void setServiceImplPath(String serviceImplPath) {
		this.serviceImplPath = serviceImplPath;
	}
	public String getMappingPath() {
		return mappingPath;
	}
	public void setMappingPath(String mappingPath) {
		this.mappingPath = mappingPath;
	}
}
