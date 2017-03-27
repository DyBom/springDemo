/**   
* @Title: DemoAnnoController.java 
* @Package com.dybom.spring.controller 
* @author dyBome xdy_0722@sina.cn   
* @date 2017年3月25日 下午2:52:29 
* @version V1.0   
*/
package com.dybom.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dybom.spring.domain.DemoObj;

/** 
* @ClassName: DemoAnnoController 
* @Description: demo控制器
* @author dyBom xdy_0722@sina.cn 
* @date 2017年3月25日 下午2:52:29 
*  
*/
@Controller
@RequestMapping("/anno")
public class DemoAnnoController {

	@RequestMapping(produces="text/plain;charset=UTF-8")
	public @ResponseBody String index(HttpServletRequest reqeust){
		return "url:"+reqeust.getRequestURL()+" can access!";
	}
	
	@RequestMapping(value="/pathvar/{str}",produces="text/plain;charset=UTF-8")
	public @ResponseBody String demoPathVar(@PathVariable String str,HttpServletRequest reqeust){
		return "url:"+reqeust.getRequestURL()+" can access,str="+str;
	}
	@RequestMapping(value="/requestParam",produces="text/plain;charset=UTF-8")
	public @ResponseBody String passRequestParam(Long id,HttpServletRequest reqeust){
		return "url:"+reqeust.getRequestURL()+" can access,id="+id;
	}
	@RequestMapping(value="/obj",produces="application/json;charset=UTF-8")
	public @ResponseBody String passObj(DemoObj demo,HttpServletRequest reqeust){
		return "url:"+reqeust.getRequestURL()+" can access,obj.id="+demo.getId()+",obj.name="+demo.getName();
	}
	@RequestMapping(value={"/name1","/name2"},produces="text/plain;charset=UTF-8")
	public @ResponseBody String remove(HttpServletRequest reqeust){
		return "url:"+reqeust.getRequestURL()+" can access";
	}
}
