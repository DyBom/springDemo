/**   
* @Title: DemoInterceptor.java 
* @Package com.dybom.spring.interceptor 
* @author dyBome xdy_0722@sina.cn   
* @date 2017年3月25日 下午3:27:07 
* @version V1.0   
*/
package com.dybom.spring.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/** 
* @ClassName: DemoInterceptor 
* @Description: 拦截器 Demo 
* @author dyBom xdy_0722@sina.cn 
* @date 2017年3月25日 下午3:27:07 
*  
*/
public class DemoInterceptor extends HandlerInterceptorAdapter {
	private final static Logger LOG=LoggerFactory.getLogger(DemoInterceptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object handler){
		long startTime=System.currentTimeMillis();
		request.setAttribute("startTime", startTime);
		return true;
	}
	@Override
	public void postHandle(HttpServletRequest request,HttpServletResponse response,Object handler,ModelAndView model) throws Exception{
		long startTime=(long) request.getAttribute("startTime");
		long endTime=System.currentTimeMillis();
		LOG.info("API:{}|请求耗时:{}",request.getRequestURL(),new Long(endTime-startTime)+"ms");
		request.setAttribute("handlingTime", endTime-startTime);
	}
}
