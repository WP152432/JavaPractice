/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ Dog.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 26.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class Dog extends Animal{
	public Dog(String name){
		super(name);
	}
	
	// 부모 클래스의 bark 메소드 재정의. (Overriding)
	
	//@Overriding
	public void bark(){
		System.out.println("멍멍");
	}
	
	public void wag(){
		System.out.println("꼬리를 흔든다.");
	}
}
