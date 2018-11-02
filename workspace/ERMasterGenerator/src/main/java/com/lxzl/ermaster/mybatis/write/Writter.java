package com.lxzl.ermaster.mybatis.write;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Writter {

	public boolean write(File dir, String fileName, List<String> contentList) {
		if(!dir.exists()) {
			dir.mkdirs();
		}
		
		String filePath = dir.getAbsolutePath() + File.separator + fileName;
		
		BufferedWriter bufferedWriter = null;
		
		try {
			bufferedWriter = new BufferedWriter(new FileWriter(filePath));
			
			for (String content : contentList) {
				bufferedWriter.write(content);
				bufferedWriter.newLine();
			}
			
			bufferedWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(bufferedWriter != null) {
				try {
					bufferedWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return true;
	}
}
