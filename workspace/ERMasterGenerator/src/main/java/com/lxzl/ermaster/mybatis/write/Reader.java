package com.lxzl.ermaster.mybatis.write;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author nannan.c.wang
 *
 */
public class Reader {

	public List<String> readFile(File file) {

		BufferedReader bufferedReader = null;
		List<String> dataList = new ArrayList<String>();
		try {
			bufferedReader = new BufferedReader(new FileReader(file));
			
			String readedLine = bufferedReader.readLine();
			
			while (readedLine != null) {
				
				dataList.add(readedLine);
				
				readedLine = bufferedReader.readLine();
			}
			
			bufferedReader.close();
			
		} catch (FileNotFoundException e) {
			return dataList;
		} catch (IOException e) {
			return dataList;
		}
		return dataList;
	}
}
