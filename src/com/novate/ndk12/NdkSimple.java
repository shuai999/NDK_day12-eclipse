package com.novate.ndk12;

public class NdkSimple {
	public static void main(String[] args) {
		NdkSimple ndkSimple = new NdkSimple() ;
		// 获取签名的秘钥
		String signaturePwd = ndkSimple.getSignaturePwd() ;
		System.out.println("秘钥 = " + signaturePwd);
	}
	
	// 1. 定义好本地的native方法，这个是让 c调用的
	public native String getSignaturePwd() ;
	
	
	// 2. 引入加载我们的动态库
	static {
		// 引入加载我们的动态库
		// System.load: 加载一个具体路径上的 .so库，或者 去服务器去下载然后进行加载(下载的路径必须是data/data)
		// System.loadLibrary：用于android，加载apk中的 libs目录 下的 .so库
		System.load("E:\\code\\ndk\\NDK_day12_VS\\NDK_day12_VS\\x64\\Debug/NDK_day12_VS.dll");
	}
}
