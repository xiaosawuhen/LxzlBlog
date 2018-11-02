package com.lxzl.ermaster.mybatis.bean.factory;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.lxzl.ermaster.mybatis.analyze.BeanAnalyz;
import com.lxzl.ermaster.mybatis.bean.BeanInfo;

/**
 * @author nannan.c.wang
 *
 */
public class MybatisBeanFactory {
	
	private String basePath;
	
	public List<BeanInfo> createBean(String beanPath) {

		this.basePath = beanPath;
		
		// 取得所有的文件
		File baseDic = new File(basePath);
		List<File> fileList = getFileList(baseDic);
		
		// 分析文件属性
		BeanAnalyz beanAnalyz = new BeanAnalyz();
		List<BeanInfo> beanList = beanAnalyz.analyzAll(fileList);
		
		return beanList;
	}
	
	public List<File> getFileList(File file) {
		List<File> fileList = new ArrayList<File>();

		File[] subFiles = file.listFiles();
		
		for (File subFile : subFiles) {
			if(subFile.isFile()){
				fileList.add(subFile);
			} else if(subFile.isDirectory()) {
//				fileList.addAll(getFileList(subFile));
			}
		}
		
		return fileList;
	}
}
