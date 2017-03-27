
package com.dybom.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.dybom.spring.interceptor.DemoInterceptor;

/**
 * 
 * @ClassName: MyMvcConfig
 * @Description: 配置文件
 * @author dyBom xdy_0722@sina.cn
 * @date 2017年3月25日 下午2:07:57
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.dybom.spring")
public class MyMvcConfig extends WebMvcConfigurerAdapter {
	// 注入视图
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/classes/views/");
		viewResolver.setSuffix(".jsp");
		viewResolver.setViewClass(JstlView.class);
		return viewResolver;
	}

	// 注入拦截器
	@Bean
	public DemoInterceptor demoInterceptor() {
		return new DemoInterceptor();
	}
	//文件上传大小
	@Bean
	public MultipartResolver multipartResolver(){
		CommonsMultipartResolver multipartResolver=new CommonsMultipartResolver();
		multipartResolver.setMaxUploadSize(100000);
		return multipartResolver;
	}
	// 重写资源加载
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/assets/**");
	}

	// 重写拦截器
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(demoInterceptor());
	}

	// 简单无逻辑的跳转页面
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/index").setViewName("/index");
		registry.addViewController("/sse").setViewName("/sse");
		registry.addViewController("/toUpload").setViewName("/upload");
	}

	//参数路径“.”
	@Override
	public void configurePathMatch(PathMatchConfigurer configurer) {
		configurer.setUseSuffixPatternMatch(false);
	}
}
