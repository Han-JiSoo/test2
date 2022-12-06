package com.web;

public class ArrayListTest {

	public static void main(String[] args) {
		
		for(int i=1; i<=20; i++) {
			if(i%10%3 == 0 && i%10 != 0) {
				System.out.println("짝");
			} else {
				System.out.println(i);
			}
		}
	}
}
