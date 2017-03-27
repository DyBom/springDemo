/**   
* @Title: DemoObj.java 
* @Package com.dybom.spring.domain 
* @author dyBome xdy_0722@sina.cn   
* @date 2017年3月25日 下午2:51:08 
* @version V1.0   
*/
package com.dybom.spring.domain;

/** 
* @ClassName: DemoObj 
* @Description: obj demo
* @author dyBom xdy_0722@sina.cn 
* @date 2017年3月25日 下午2:51:08 
*  
*/
public class DemoObj {
	
	private long id;
	private String name;
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/** 
	* <p>Title: </p> 
	* <p>Description: </p>  
	*/
	public DemoObj() {
		super();
		// TODO Auto-generated constructor stub
	}
	/** 
	* <p>Title: </p> 
	* <p>Description: </p> 
	* @param id
	* @param name 
	*/
	public DemoObj(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
