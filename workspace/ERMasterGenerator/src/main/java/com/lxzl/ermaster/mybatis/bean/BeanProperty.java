package com.lxzl.ermaster.mybatis.bean;

/**
 * @author nannan.c.wang
 *
 */
public class BeanProperty {

	private String name;
	
	private PropertyType propertyType;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PropertyType getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(String type) {
		PropertyType _default = PropertyType.NONE;
		if(type.toLowerCase().startsWith("list")) {
			type = "list";
		}
		
		switch (type.toLowerCase()) {
		case "string":
			break;
		case "int":
		case "ingeter":
			_default = PropertyType.INTEGER;
			break;
		case "date":
			_default = PropertyType.INTEGER;
			break;
		case "list":
			_default = PropertyType.LIST;
			break;
		default:
			_default = PropertyType.NONE;
			break;
		}
		
		this.propertyType = _default;
	}
}
