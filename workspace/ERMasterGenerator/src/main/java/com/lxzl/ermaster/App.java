package com.lxzl.ermaster;

import java.util.List;
import java.util.Map;

import com.lxzl.ermaster.mybatis.bean.BeanInfo;
import com.lxzl.ermaster.mybatis.bean.factory.MybatisBeanFactory;
import com.lxzl.ermaster.mybatis.output.factory.OutputContextFactory;
import com.lxzl.ermaster.mybatis.output.factory.OutputFactory;
import com.lxzl.ermaster.mybatis.output.info.OutputPath;

/**
 * @author nannan.c.wang
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	MybatisBeanFactory beanFactory = new MybatisBeanFactory();
    	
    	String basePath = "javaBean";
    	
    	List<BeanInfo> beanList = beanFactory.createBean(basePath);

		// 生成文件
		for (BeanInfo beanInfo : beanList) {
			OutputContextFactory contextFactory = new OutputContextFactory(beanInfo, basePath);
			
			Map<String, Object> ctx = contextFactory.getContext();
			OutputPath outputPath = contextFactory.getOutputPath();
			
			OutputFactory outputHandler = OutputFactory.createOutput("config/mappingTemplate");
			outputHandler.transfor(outputPath.getMappingPath(), ctx);

			outputHandler = OutputFactory.createOutput("config/serviceTemplate");
			outputHandler.transfor(outputPath.getServicePath(), ctx);

			outputHandler = OutputFactory.createOutput("config/serviceImplTemplate");
			outputHandler.transfor(outputPath.getServiceImplPath(), ctx);
			
			
			outputHandler = OutputFactory.createOutput("config/mapperTemplate");
			outputHandler.transfor(outputPath.getMapperPath(), ctx);
			
		}
    }
}
