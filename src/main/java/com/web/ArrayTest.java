package com.web;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {

		int[] ages = new int[27];
		for (int i = 0; i < ages.length; i++) {
			ages[i] = i * 2;
		}
		
		for(int i=0; i<ages.length; i++) {
			int age = ages[i];
			System.out.println(age);
		}
		
		for(int age: ages) {
			System.out.println(age);
		}
		
		System.out.println(Arrays.toString(ages));
	}
}
