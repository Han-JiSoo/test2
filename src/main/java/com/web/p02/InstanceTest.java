package com.web.p02;

public class InstanceTest {

//	static int num;
	int num;
	String str;
	
	void test() {
		System.out.println(num);
	}
	
//	static void test2() {
//		System.out.println(num);
//	}
	
//	non-static은 static, non-static 상관없이 사용 가능. static은 non-static 사용 불가.
//	non-static은 사용하려면 메모리 생성 필요
	public static void main(String[] args) {
		
		InstanceTest it = new InstanceTest();
//		InstanceTest instanceTest = new InstanceTest();  >> FM
//		it.test();		//19라인에서 자동으로 초기화 해줌
		it.num = 100;
		it.test();
	}
}
