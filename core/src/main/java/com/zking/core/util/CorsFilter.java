package com.zking.core.util;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * 配置tomcat允许跨域访问
 * 
 * @author Administrator
 *
 */
public class CorsFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {

		HttpServletResponse response = (HttpServletResponse) servletResponse;
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Accept, Content-Type");
		response.setHeader("Access-Control-Allow-Methods", "GET, HEAD, POST, PUT, DELETE, TRACE, OPTIONS, PATCH");
		response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
		// 是否允许浏览器携带用户身份信息（cookie）
		response.setHeader("Access-Control-Allow-Credentials","true");
		// 图片上传会用到
		if( "OPTIONS".equals(request.getMethod())){
		}
		filterChain.doFilter(servletRequest, servletResponse);
	}

	@Override
	public void destroy() {

	}
}