/**
 * 
 */
package org.dimigo.oop;

import java.util.Arrays;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ ArraysTest.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 10.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class ArraysTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] src = {"꿈의등불","전전전세","Sparkle","아무것도 아니야"};
		
		// 배열 출력
		System.out.println(Arrays.toString(src));
		
		// 배열 복사
		String copy[] = Arrays.copyOf(src, src.length);
		System.out.println(Arrays.toString(copy));
		System.out.println(src);
		System.out.println(Arrays.equals(src, copy));
		Arrays.sort(src);
		System.out.println(Arrays.toString(src));
		System.out.println(Arrays.binarySearch(src, "아무것도 아니야"));

		System.out.println(args[0]+args[1]);
		
		System.out.println(copy);
	}
}
