/**   
* @Title: ExceptionAdvice.java 
* @Package com.dybom.spring.exception 
* @author dyBome xdy_0722@sina.cn   
* @date 2017年3月25日 下午3:52:39 
* @version V1.0   
*/
package com.dybom.spring.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/** 
* @ClassName: ExceptionAdvice 
* @Description: 异常处理Advice
* @author dyBom xdy_0722@sina.cn 
* @date 2017年3月25日 下午3:52:39 
*  
*/
@ControllerAdvice
public class ExceptionHandlerAdvice {

	/**
	 * 
	* @Title: exception 
	* @Description: 全局处理，拦截所有的Exception 
	* @param @param exception
	* @param @param request
	* @param @return    设定文件 
	* @return ModelAndView    返回类型 
	* @throws
	 */
	@ExceptionHandler(value=Exception.class)
	public ModelAndView exception(Exception exception,WebRequest request){
		ModelAndView modelAndView=new ModelAndView("error");
		modelAndView.addObject("errorMsg", exception.getMessage());
		return modelAndView;
	}
	/**
	 * 
	* @Title: addAttributes 
	* @Description: 所有的注解@RequestMapping将获得此键值对
	* @param @param model    设定文件 
	* @return void    返回类型 
	* @throws
	 */
	@ModelAttribute
	public void addAttributes(Model model){
		model.addAttribute("msg", "异常消息");
	}
	/**
	 * 
	* @Title: initBinder 
	* @Description: 
	* @param @param webDataBinder    设定文件 
	* @return void    返回类型 
	* @throws
	 */
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder){
		webDataBinder.setDisallowedFields("id");
	}
}
