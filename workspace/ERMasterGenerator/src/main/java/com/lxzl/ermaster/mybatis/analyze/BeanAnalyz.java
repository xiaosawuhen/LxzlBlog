package com.lxzl.ermaster.mybatis.analyze;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.lxzl.ermaster.mybatis.bean.BeanInfo;
import com.lxzl.ermaster.mybatis.bean.BeanProperty;
import com.lxzl.ermaster.mybatis.write.Reader;

/**
 * @author nannan.c.wang
 *
 */
public class BeanAnalyz {

	public BeanInfo analyz(File beanFile) {
		BeanInfo info = new BeanInfo();
		
		Reader reader = new Reader();
		List<String> contentList = reader.readFile(beanFile);
		for (String content : contentList) {
			content = content.trim();
			
			if(content.startsWith("package")) {
				String _package = content.split(" ")[1].replaceAll(";", "");
				info.set_package(_package);
			}
			
			if(content.startsWith("public") && content.contains(" class ")) {
				String name = content.split(" ")[2].replaceAll("}", "");
				info.setName(name);
			}
			
			if(content.startsWith("private")) {
				if(!content.contains(" serialVersionUID ")) {
					BeanProperty property = new BeanProperty();
					String[] attr = content.split(" ");
					property.setName(attr[2].replaceAll(";", ""));
					property.setPropertyType(attr[1]);
					info.addProperty(property);
				}
			}
		}
		
		return info;
	}
	
	public List<BeanInfo> analyzAll(List<File> beanFileList) {
		List<BeanInfo> porpertyList = new ArrayList<BeanInfo>();
		
		for (File file : beanFileList) {
			BeanInfo porperty = analyz(file);
			porpertyList.add(porperty);
		}
		
		return porpertyList;
	}
}
