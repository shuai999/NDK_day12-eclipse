package com.novate.ndk12;

public class NdkSimple {
	public static void main(String[] args) {
		NdkSimple ndkSimple = new NdkSimple() ;
		// ��ȡǩ������Կ
		String signaturePwd = ndkSimple.getSignaturePwd() ;
		System.out.println("��Կ = " + signaturePwd);
	}
	
	// 1. ����ñ��ص�native������������� c���õ�
	public native String getSignaturePwd() ;
	
	
	// 2. ����������ǵĶ�̬��
	static {
		// ����������ǵĶ�̬��
		// System.load: ����һ������·���ϵ� .so�⣬���� ȥ������ȥ����Ȼ����м���(���ص�·��������data/data)
		// System.loadLibrary������android������apk�е� libsĿ¼ �µ� .so��
		System.load("E:\\code\\ndk\\NDK_day12_VS\\NDK_day12_VS\\x64\\Debug/NDK_day12_VS.dll");
	}
}
