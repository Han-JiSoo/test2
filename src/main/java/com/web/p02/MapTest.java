package com.web.p02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("번호", "1");
		map.put("이름", "홍길동");
		
		List<Map<String, String>> list = new ArrayList<>();
		list.add(map);
		
		Map<String, String> map2 = new HashMap<>();
		map2.put("번호", "2");
		map2.put("이름", "김길동");
		list.add(map2);

		Map<String, String> map3 = new HashMap<>();
		map3.put("번호", "3");
		map3.put("이름", "우길동");
		list.add(map3);
		
		Map<String, String> map4 = new HashMap<>();
		map4.put("번호", "4");
		map4.put("이름", "박길동");
		list.add(map4);
		
		Map<String, String> map5 = new HashMap<>();
		map5.put("번호", "5");
		map5.put("이름", "지길동");
		list.add(map5);
		
		System.out.println(list);
		
		
	}
}
