/**   
* @Title: RestDemoController.java 
* @Package com.dybom.spring.controller 
* @author dyBome xdy_0722@sina.cn   
* @date 2017年3月25日 下午3:12:46 
* @version V1.0   
*/
package com.dybom.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dybom.spring.domain.DemoObj;

/** 
* @ClassName: RestDemoController 
* @Description: Rest控制器 
* @author dyBom xdy_0722@sina.cn 
* @date 2017年3月25日 下午3:12:46 
*  
*/
@RestController
@RequestMapping("/rest")
public class RestDemoController {

	
	@RequestMapping(value="/obj",produces="application/json;charset=UTF-8")
	public  DemoObj passObj(DemoObj demo){
		return new DemoObj(demo.getId(),demo.getName());
	}
}
