package com.lxzl.service.upload.impl;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.lxzl.constant.SessionConstant;
import com.lxzl.service.upload.ImageUploadService;

@Service("imageUploadService")
public class ImageUploadServiceImpl implements ImageUploadService{

	@Value("${staticFilePath}")
	private String uploadRootPath;
	
	public String uploadFile(MultipartFile file, HttpServletRequest request) throws IllegalStateException, IOException {

			Long cid = (Long)request.getSession().getAttribute(SessionConstant.COMPANY_ID);
			String userName = (String)request.getSession().getAttribute(SessionConstant.USER_NAME);
			String filePath = uploadRootPath + File.separator + cid.toString() + File.separator + userName + File.separator + file.getOriginalFilename();

			File imageFile = new File(filePath);
			imageFile.mkdirs();
			
			file.transferTo(imageFile);  
			
			String imgUrl = "/static/" + cid.toString() + "/"+ userName + "/" + file.getOriginalFilename();
		return imgUrl;
	}

}
