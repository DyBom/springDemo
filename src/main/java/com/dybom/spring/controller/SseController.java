/**   
* @Title: SseController.java 
* @Package com.dybom.spring.controller 
* @author dyBome xdy_0722@sina.cn   
* @date 2017年3月25日 下午11:09:50 
* @version V1.0   
*/
package com.dybom.spring.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** 
* @ClassName: SseController 
* @Description: SSE(server send event) 服务器端推送技术
* @author dyBom xdy_0722@sina.cn 
* @date 2017年3月25日 下午11:09:50 
*  
*/
@RestController
public class SseController {

	@RequestMapping(value="push",produces="text/event-stream")
	public String push(){
		Random random=new Random();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "data:Testing 1,2,3"+random.nextInt()+"\n\n";
	}
}
