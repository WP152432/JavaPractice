/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <pre>
 * org.dimigo.collection
 *   |_ ArrayListTest.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 6. 2.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class ArrayListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 제네릭 (Generic) : List에 들어갈 데이터의 타입을 지정한다.
		List<String> list = new ArrayList<>();
		
		System.out.println("<< 데이터 추가 >>");
		list.add("금요귀가");
		list.add("목요귀가");
		list.add("수요귀가");
		list.add("화요귀가");
		list.add("월요귀가");
		list.add("일요귀가");
		list.add("토요일은 이미 집에 있습니다.");
		list.add("금요귀가");
		
		System.out.println(list.size());
		printList(list);
		
		System.out.println("<< 데이터 검색 >>");
		System.out.println(list.get(1));
		
		System.out.println("<< 데이터 삽입 >>");
		list.add(list.size()-1, "토요일 저녁 - 당신은 시한부 선고를 받았습니다.");
		
		printList(list);
		
		System.out.println("<< 데이터 교체 >>");
		list.set(list.size()-2, "토요일 저녁 - 당신은 내일 학교를 들어가지 않아도 된다는 정희범 선생님의 공지를 보았습니다. 살날이 1일 늘었습니다.");
		printList(list);
		
		list.remove(0);
		printList(list);
		
		System.out.println("<< 데이터 전체 삭제 >>");
		list.clear();
		printList(list);
	}
	
	public static void printList(List<String> list){
		for(String value : list){
			System.out.println(value);
		}
		
		System.out.println("-------------------------------");
	}
	
	//iterator
	public static void printList2(List<String> list){
		Iterator<String> i = list.iterator();
		
		while(i.hasNext()){
			System.out.println(i.next());
		}
		System.out.println("-------------------------------");
	}
	
	// 람다식 (Lambda Expression)
	// 특별한 식별자가 없는데 실행가능한 함수식.
	// (params) -> {expression}
	
	public static void printList3(List<String> list){
		list.forEach(value -> {System.out.println(value);});
		System.out.println("-------------------------------");
	}

}
