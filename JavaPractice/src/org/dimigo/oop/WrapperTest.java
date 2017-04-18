/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ WrapperTest.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 12.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class WrapperTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		int i = Integer.parseInt("100");
//		System.out.println(i == 100);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.BYTES);
		System.out.println(Integer.toString(100));
		System.out.println(Integer.toBinaryString(100));
		System.out.println(Integer.toHexString(100));
		
		// 생성자 이용 Boxing
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("100");
		
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
		
		// valueOf 함수를 이용한 Boxing
		Integer obj3 = Integer.valueOf(100);
		System.out.println(obj1.equals(obj3));
		
		// Unboxing
		System.out.println(obj1.intValue() == 100);
		System.out.println(obj1.intValue() == 100);
		
		Double obj4 = Double.valueOf(3.141592);
		double pi = obj4.doubleValue();
		System.out.println(obj4.doubleValue());
		System.out.println(pi == 3.141592);
		
		Integer obj5 = new Integer(1000);
		Integer obj6 = new Integer(2000);
		
		Integer result = obj5 + obj6;
		
		System.out.println(result);
		
		Integer obj7 = 1000;
		int i  = obj7+100;
		System.out.println(i);
		
		Integer n1 = 10; // autoboxing
		Integer n2 = n1+20; // unboxing / autoboxig
		Integer result2 = n1+n2; // unboxing , unboxing;
	}

}
