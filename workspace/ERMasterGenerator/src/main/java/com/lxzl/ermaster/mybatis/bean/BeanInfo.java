package com.lxzl.ermaster.mybatis.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nannan.c.wang
 *
 */
public class BeanInfo {

	private String _package;
	
	private String name;
	
	private List<BeanProperty> propertyList;

	/**
	 * @return the _package
	 */
	public String get_package() {
		return _package;
	}

	/**
	 * @param _package the _package to set
	 */
	public void set_package(String _package) {
		this._package = _package;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public List<BeanProperty> getPropertyList() {
		return propertyList;
	}

	public void setPropertyList(List<BeanProperty> propertyList) {
		this.propertyList = propertyList;
	}
	
	public void addProperty(BeanProperty property) {
		if(this.propertyList == null) {
			this.propertyList = new ArrayList<>();
		}
		
		this.propertyList.add(property);
	}
}
