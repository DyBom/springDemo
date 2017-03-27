/**   
* @Title: HelloController.java 
* @Package com.dybom.spring.controller 
* @author dyBome xdy_0722@sina.cn   
* @date 2017年3月25日 下午2:22:48 
* @version V1.0   
*/
package com.dybom.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/** 
* @ClassName: HelloController 
* @Description: 简单的控制器
* @author dyBom xdy_0722@sina.cn 
* @date 2017年3月25日 下午2:22:48 
*  
*/
@Controller
public class HelloController {

	private final static Logger LOG=LoggerFactory.getLogger(HelloController.class);
	
	@RequestMapping("/")
	public String hello(){
		LOG.info("\ncalled for index!");
		return "index";
	}
}
