package com.novate.ndk12;

import java.util.UUID;

public class NdkSimple1 {
	
	// c���� java�е�����
	// �����ǣ��� native�� ��name �޸�Ϊ Jack
	private String name = "Novate" ;
	
	// c���� java�еľ�̬����
	// �����ǣ��� native��� age �޸�Ϊ 36
	public static int age = 24 ;
	
	
	/**
	 * ͨ�� c ������� add����
	 */
	public int add(int number1 , int number2) {
		return number1 + number2 ;
	}
	
	// ��ҵ��дһ����̬�Ļ�ȡ uuid�ķ�����Ȼ���� c�е��������������ȡuuid
	// ��Ϊ�����c��ֱ��д��ȡ uuid��������д�ܶ���룬���Կ�������java��д�ã�Ȼ���� c�е��ü���
	public static String getUUID() {
		return UUID.randomUUID().toString();
	}
	
	public static void main(String[] args) {
		NdkSimple1 ndkSimple1 = new NdkSimple1();
		
		/*System.out.println("�޸�ǰ��"+ndkSimple1.name);
		ndkSimple1.changeName();
		System.out.println("�޸ĺ�"+ndkSimple1.name);*/
	
		
		/*System.out.println("�޸�ǰ��"+NdkSimple1.age);
		ndkSimple1.changeName();
		System.out.println("�޸ĺ�"+NdkSimple1.age);*/
		
		
		ndkSimple1.callAddMathod();
		
	}
	
	
	// �޸�����
	// ����ñ��ص�native���������������c���õ� native����
	public native void changeName() ;
	// ����ñ��ص�native���������������c���õ� native����
	public static native void changeAge();
	
	// c ���� java����
	public native void callAddMathod() ;
	
	static {
		// ����������ǵĶ�̬��
		// System.load: ����һ������·���ϵ� .so�⣬���� ȥ������ȥ����Ȼ����м���(���ص�·��������data/data)
		// System.loadLibrary������android������apk�е� libsĿ¼ �µ� .so��
		System.load("E:\\code\\ndk\\NDK_day12_VS\\NDK_day12_VS\\x64\\Debug/NDK_day12_VS.dll");
	}
}
