package com.lxzl.ermaster.mybatis.output.factory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;
import com.lxzl.ermaster.mybatis.bean.BeanInfo;

public class OutputFactory {
	
	private Mustache mustache;
	
	private String templatePath;
	
	private OutputFactory(String templatePath) {
		this.templatePath = templatePath;
		
		MustacheFactory mf = new DefaultMustacheFactory();
        mustache = mf.compile(this.templatePath);
	}
	
	public static OutputFactory createOutput(String templatePath) {
		return new OutputFactory(templatePath);
	}
	
	public void transfor(String outputPath, Map<String, Object> ctx) {
        try {
//    		mustache.execute(new PrintWriter(System.out), ctx).flush();
        	File file = new File(outputPath);
        	if(!file.getParentFile().exists()) {
        		file.getParentFile().mkdirs();
        	}
        	FileWriter writer = new FileWriter(outputPath);
			mustache.execute(writer, ctx).flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
	    String templete = "test.txt";  
        
        List<BeanInfo> infoList = new ArrayList<>();
        BeanInfo beanInfo = new BeanInfo();
        beanInfo.set_package("111");
        beanInfo.setName("111");
        infoList.add(beanInfo);beanInfo = new BeanInfo();
        beanInfo.set_package("222");
        beanInfo.setName("222");
        infoList.add(beanInfo);

		
		MustacheFactory mf = new DefaultMustacheFactory();
		Mustache mustache = mf.compile(templete);
        
        Map<String, Object> ctx = new HashMap<String, Object>();  
        ctx.put("name", "Chris");  
        ctx.put("value", "10000");  
        ctx.put("taxed_value", "10000 - (10000 * 0.4)");  
        ctx.put("in_ca", "true");  
        ctx.put("infoList", infoList);
        
        try {
			mustache.execute(new PrintWriter(System.out), ctx).flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
}
