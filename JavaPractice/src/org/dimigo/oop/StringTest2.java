/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ StringTest2.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 31.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class StringTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. String 으로 문자열 추가하기
		
		String str = "디미고 ";
		str += "2학년 ";
		str += "4반 ";
		str += "32번 ";
		str += "조영서 ";
		
		System.out.println(str);
		
		// String Builder 로 문자열 추가하기
		
		StringBuilder sb = new StringBuilder("디미고 ");
//		sb.append("2학년 ");
//		sb.append("4반 ");
//		sb.append("32번 ");
//		sb.append("조영서");

		sb.append("2학년 ").append("4반 ").append("32번 ").append("조영서");
		System.out.println(sb.toString());
		System.out.println(sb);
		
		Book book = new Book("미생",1000,"윤태호");
		System.out.println(book);
		
		
		new StringTest2().compareSpeed();
		
	}

	/**
	 * 
	 */
	private void compareSpeed() {
		// TODO Auto-generated method stub
		
		long start = System.currentTimeMillis();
		String test = "abc";
		StringBuilder sb = new StringBuilder("abc");
		
		for(int i = 0; i<1000000;i++){
			//test += "def";
			sb.append("def");
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
		
	}

}
