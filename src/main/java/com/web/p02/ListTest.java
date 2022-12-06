package com.web.p02;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
//		배열에서의 중요한 요소는 element
//		배열의 단점을 해소/ 정해진 크기, 데이터의 추가 삭제에 자유롭지 못하다.
		List<Integer> ages = new ArrayList<>();
		ages.add(33);
		ages.add(22);
		ages.add(11);
		ages.add(44);
		ages.add(55);
		
//		int ages = new int[5];
//		ages[0] = 33;
//		ages[1] = 22;
//		ages[2] = 11;
//		ages[3] = 44;
//		ages[4] = 55;
		
//		swap
//		int[] tmps = ages;
//		
//		ages = new int[10];
//		
//		for(int i=0; i<tmps.length; i++) {
//			ages[i] = tmps[i];
//		}
//		
//		for(int i=0; i<ages.length; i++) {
//			System.out.println(i + "번 째 값: " + ages[i]);
//		}
	}

	
}
