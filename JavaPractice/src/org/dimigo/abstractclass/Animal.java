/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.abstractclass
 *   |_ Animal.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 17.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public abstract class Animal {
	private String name;
	
	public Animal(){
		
	}
	
	public Animal(String name){
		this.name = name;
	}
	
	public void eat(){
		System.out.println("쩝쩝");
	}
	
	public void sleep(){
		System.out.println("쿨쿨");
	};
	
	public abstract void bark();
}
