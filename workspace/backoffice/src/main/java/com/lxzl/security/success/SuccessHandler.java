package com.lxzl.security.success;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

import com.lxzl.constant.SessionConstant;

public class SuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {

		String userName = authentication.getName();
		request.getSession().setAttribute(SessionConstant.USER_NAME, userName);

		super.onAuthenticationSuccess(request, response, authentication);
	}

}
