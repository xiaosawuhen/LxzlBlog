package com.lxzl.service.upload;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

public interface ImageUploadService {

	String uploadFile(MultipartFile file, HttpServletRequest request) throws IllegalStateException, IOException;
}
