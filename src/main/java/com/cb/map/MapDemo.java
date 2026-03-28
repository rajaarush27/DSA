package com.cb.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("Aarush", 25);
		map.put("Mishra", 26);
		
		System.out.println(map.keySet());
		System.out.println(map.entrySet());
		System.out.println(map);
	}
}
