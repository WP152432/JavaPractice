/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Test.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 5.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class Test {
	public static void main(String[] args) {
		int[] intArr = new int[5];
		String[] strArr = new String[3];
		Book bookArr[] = new Book[1];
		
		intArr[3] = 100;
		strArr[2] = "디미고";
		bookArr[1] = new Book("미생",512,"윤태호");
		
		System.out.println(bookArr[1].getTitle());
	}
}
