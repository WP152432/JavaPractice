/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ Cat.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 8.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class Cat extends Animal{
	public Cat(String name){
		super(name);
	}

	public void bark(){
		System.out.println("야옹");
	};
	
	//Cat 에만 있는 메소드
	
	public void scratch(){
		System.out.println("할퀴다");
	}
}
