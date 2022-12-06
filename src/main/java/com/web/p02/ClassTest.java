package com.web.p02;

class Driver {
	
}

public class ClassTest {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("에러 발생 시 내 위에 에러가 뜰거고 안뜨면 정상!");
	}
}
