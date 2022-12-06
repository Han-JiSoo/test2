package com.web.p01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lotto {

	private static final int LOTTO_COUNT = 6;

	public static void main(String[] args) {

		Random r = new Random();
		int[] lottoNums = new int[LOTTO_COUNT];

		for (int i = 1; i <= LOTTO_COUNT; i++) {
			lottoNums[i - 1] = r.nextInt(45) + 1;
			for (int j = 1; j < i; j++) {
				if (lottoNums[j - 1] == lottoNums[i - 1]) {
					i--;
					break;
				}
			}
		}
		for (int rNum : lottoNums) {
			System.out.println(rNum);
		}

		List<Integer> lottoList = new ArrayList<>();

		for (int i = 1; i <= LOTTO_COUNT; i++) {
			lottoList.add(r.nextInt(45) + 1);
		}
		System.out.println(lottoList);
	}
}
<<<<<<< HEAD

=======
>>>>>>> branch 'master' of https://github.com/Han-JiSoo/test2.git
