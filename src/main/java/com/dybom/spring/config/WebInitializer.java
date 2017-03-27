/**   
* @Title: WebInitializer.java 
* @Package com.dybom.spring.config 
* @author dyBome xdy_0722@sina.cn   
* @date 2017年3月25日 下午2:09:10 
* @version V1.0   
*/
package com.dybom.spring.config;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/** 
* @ClassName: WebInitializer 
* @Description: Web配置
* WebApplicationInitializer:是spring提供用來配置Servlet3.0＋配置的api,替代了web.xml
* @author dyBom xdy_0722@sina.cn 
* @date 2017年3月25日 下午2:09:10 
*  
*/
public class WebInitializer implements WebApplicationInitializer{

	/* (non-Javadoc)
	 * @see org.springframework.web.WebApplicationInitializer#onStartup(javax.servlet.ServletContext)
	 */
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext context=new AnnotationConfigWebApplicationContext();
		context.register(MyMvcConfig.class);
		context.setServletContext(servletContext);
		
		Dynamic servlet=servletContext.addServlet("dispatcher", new DispatcherServlet(context));
		servlet.addMapping("/");
		servlet.setLoadOnStartup(1);
		
	}
	
}
