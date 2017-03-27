/**   
* @Title: UploadController.java 
* @Package com.dybom.spring.controller 
* @author dyBome xdy_0722@sina.cn   
* @date 2017年3月25日 下午10:47:35 
* @version V1.0   
*/
package com.dybom.spring.controller;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @ClassName: UploadController
 * @Description: 文件上传
 * @author dyBom xdy_0722@sina.cn
 * @date 2017年3月25日 下午10:47:35
 * 
 */
@RestController
public class UploadController {

	@RequestMapping(value = "upload", method = RequestMethod.POST)
	public String upload(MultipartFile file) {
		try {
			FileUtils.writeByteArrayToFile(new File("e:/soft/"+file.getOriginalFilename()),file.getBytes());
		} catch (Exception e) {
			e.printStackTrace();
			return "wrong";
		}
		return "ok";
	}
}
