package com.web.p02;

public class MethodTest {

	static void test() {
		System.out.println("안녕하세요. 나는 void 입니다.");
//		return; 		//void는 리턴은 가능하다. 리턴값이 없을뿐. 
//						return 사용 시 메소드가 끝이 나기 때문에 적절히 사용하면 아주 좋은 코드가 된다.		
	}
	
	static int test(int a) {
		System.out.println("안녕하세요. 나는 int타입 입니다.");
		return 0;
	}
	
	public static void main(String[] args) {
		test();				//FM : MethodTest.test(); test는 static 메소드이기 때문.
		int t = test(1);	//return type : int 따라서 int타입 변수에 대입 가능하다.
	}
}
