/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Count.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 17.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class Count {
	static int count;

	/**
	 * @param args
	 */
	
	public Count(){
		count++;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			new Count();
		}
		
		System.out.println(count);
	}

}
