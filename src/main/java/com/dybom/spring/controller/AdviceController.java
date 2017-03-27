/**   
* @Title: AdviceController.java 
* @Package com.dybom.spring.controller 
* @author dyBome xdy_0722@sina.cn   
* @date 2017年3月25日 下午4:01:49 
* @version V1.0   
*/
package com.dybom.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dybom.spring.domain.DemoObj;

/** 
* @ClassName: AdviceController 
* @Description: 建言控制器 
* @author dyBom xdy_0722@sina.cn 
* @date 2017年3月25日 下午4:01:49 
*  
*/
@Controller
public class AdviceController {

		@RequestMapping("/advice")
		public Object getSomething(@ModelAttribute("msg")String msg,DemoObj obj){
			throw new IllegalArgumentException("参数有误/"+"来自@ModelAttribute:"+msg);
		}
}
