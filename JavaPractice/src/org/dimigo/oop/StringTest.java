/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ StringTest.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 30.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1. 문자열 리터럴 방식 (Literal pool 에 생성, 동일 문자열인 경우 공유함)
		String dog1 = "뽕";
		String dog2 = "뽕";
		System.out.println(dog1 == dog2);
		
		// 2. new 객체 생성 방식 (매번 다른 문자열 객체를 생성함)
		String cat1 = new String("야옹이");
		String cat2 = new String("야옹이");
		System.out.println(cat1 == cat2);
		
		System.out.println(dog1 == "뽕");
		System.out.println(cat1 == "야옹이");
		
		System.out.println(dog1.equals(dog2));
		System.out.println(cat1.equals(cat2));
		
		
		String id = null;
		
		if("admin".equalsIgnoreCase(id)){
			System.out.println("관리자");
		}
		else{
			System.out.println("일반 사용자");
		}
		
		new StringTest().testStringMethod();
	}
	
	private void testStringMethod(){
		//           0123456789123
		String s = "abcdefgABCDEFG";
		System.out.println(s.length());
		System.out.println(s.substring(3));
		System.out.println(s.substring(5, 7));
		System.out.println("   ABC   ".trim());
		System.out.println(s.startsWith("abc"));
		System.out.println(s.endsWith("EFGH"));
	}

}
