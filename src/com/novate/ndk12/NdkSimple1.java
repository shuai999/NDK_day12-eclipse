package com.novate.ndk12;

import java.util.UUID;

public class NdkSimple1 {
	
	// c访问 java中的属性
	// 需求是：在 native层 把name 修改为 Jack
	private String name = "Novate" ;
	
	// c访问 java中的静态属性
	// 需求是：在 native层把 age 修改为 36
	public static int age = 24 ;
	
	
	/**
	 * 通过 c 调用这个 add方法
	 */
	public int add(int number1 , int number2) {
		return number1 + number2 ;
	}
	
	// 作业：写一个静态的获取 uuid的方法，然后在 c中调用这个方法来获取uuid
	// 因为如果在c中直接写获取 uuid方法，会写很多代码，所以可以先在java中写好，然后在 c中调用即可
	public static String getUUID() {
		return UUID.randomUUID().toString();
	}
	
	public static void main(String[] args) {
		NdkSimple1 ndkSimple1 = new NdkSimple1();
		
		/*System.out.println("修改前："+ndkSimple1.name);
		ndkSimple1.changeName();
		System.out.println("修改后："+ndkSimple1.name);*/
	
		
		/*System.out.println("修改前："+NdkSimple1.age);
		ndkSimple1.changeName();
		System.out.println("修改后："+NdkSimple1.age);*/
		
		
		ndkSimple1.callAddMathod();
		
	}
	
	
	// 修改属性
	// 定义好本地的native方法，这个就是让c调用的 native方法
	public native void changeName() ;
	// 定义好本地的native方法，这个就是让c调用的 native方法
	public static native void changeAge();
	
	// c 调用 java方法
	public native void callAddMathod() ;
	
	static {
		// 引入加载我们的动态库
		// System.load: 加载一个具体路径上的 .so库，或者 去服务器去下载然后进行加载(下载的路径必须是data/data)
		// System.loadLibrary：用于android，加载apk中的 libs目录 下的 .so库
		System.load("E:\\code\\ndk\\NDK_day12_VS\\NDK_day12_VS\\x64\\Debug/NDK_day12_VS.dll");
	}
}
