/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ SingletonTest.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 20.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class SingletonTest {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singletone instance = Singletone.getInstance2();
		Singletone instance2 = Singletone.getInstance2();
		
		System.out.println(instance);
		System.out.println(instance);
	}

}
