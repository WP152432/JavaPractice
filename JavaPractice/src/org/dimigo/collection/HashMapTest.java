/**
 * 
 */
package org.dimigo.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 *   |_ HashMapTest.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 6. 12.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class HashMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		
		
		System.out.println("<<데이터 추가 >>");
		map.put("국어", 100);
		map.put("수학", 92);
		map.put("영어", 100);
		
		System.out.println(map);
		
		System.out.println("<< 데이터 삭제 >>");
		map.remove("수학");
		System.out.println(map);
	}
	
	public static void printMap(Map<String, Integer> map){
		for(String key : map.keySet()){
			System.out.println(key + "=>" + map.get(key));
		}
		
		System.out.println("-----------------------------");
	}

}
