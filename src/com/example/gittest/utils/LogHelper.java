package com.example.gittest.utils;

import android.util.Log;


/**
 * 
   
* @ClassName LogHelper   

* @Description android调试类，注意在发布正式版的时候将isDebugModel变量改为false

* @author splm  

* @contact cd@zhaot.com 

* @date 2014-11-27 下午5:19:08      

* @version v1.0

* @copyright [吉林找它信息有限公司]
 */
public class LogHelper {
	
	/**
	 * 调试模式�?关，默认打开
	 */
	private static final boolean isDebugModel=true;
	
	private static final String LOGHELPER="loghelper------------>";
	
	private static final String CLASS_METHOD_LINE_FORMAT = "%s.%s()  Line:%d  (%s)";
	
	/**
	 * 
	* @Title: trace 
	  
	* @Description 打印程序运行流程，�?�用于打印无参数的调�?
	
	* @caution �?
	  
	* @author splm
	
	* @contact cd@zhaot.com
	
	* @version v1.0
	
	* @date 2014-11-27-下午5:19:22
	
	* @copyright [吉林找它信息有限公司]
	 */
	public static void trace(){
		
		if(isDebugModel){
			
			StackTraceElement stackTraceElement=Thread.currentThread().getStackTrace()[3];
			
			String d_log=String.format(CLASS_METHOD_LINE_FORMAT, stackTraceElement.getClassName(),stackTraceElement.getMethodName(),stackTraceElement.getLineNumber(),stackTraceElement.getFileName());
			
			Log.e(LOGHELPER, d_log);
			
		}
		
	}
	
	/**
	 * 
	* @Title traceField 
	  
	* @Description 打印程序运行调试数据，�?�用于打印调试数据的方法
	
	* @param arg String 调试的参数变�? 
	  
	* @return void    返回类型 
	  
	* @author splm
	
	* @contact cd@zhaot.com
	
	* @version v1.0
	
	* @date 2014-11-27-下午5:20:16
	
	* @copyright [吉林找它信息有限公司]
	 */
	public static void traceField(String arg){
		
		if(isDebugModel){
			
			StackTraceElement stackTraceElement=Thread.currentThread().getStackTrace()[3];
			
			Log.e(LOGHELPER, "类名�?"+stackTraceElement.getClassName()+",方法名："+stackTraceElement.getMethodName()+"，变量的值："+arg);
			
		}
		
	}

}
