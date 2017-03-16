/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ TypeCasting.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 10.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class TypeCasting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 자동 형변환.
		
		byte b = 10;
		int i = b;
		System.out.printf("%d %d\n",b,i);
		
		//2. 강제 형변환.
		b = (byte) i;
		
		System.out.printf("%d %d\n",b,i);
		
		//3. 주의사항
		
		int i2 = 128;
		byte b2 = (byte) i2;
		System.out.printf("%d %d",i2,b2);
		
		long l = 10000000000l;
		int i3 = (int) l;
		System.out.printf("%d",i);
	}

}
