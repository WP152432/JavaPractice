/**
 * 
 */
package org.dimicorporation.oop;

/**
 * <pre>
 * org.dimicorporation.oop
 *   |_ Korean.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 10.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class Japanese extends Person{
	public Japanese(String name){
		super(name);
	}
	
	public void sayHello(){
		System.out.println("오하요");
	}
	
	public void sayBye(){
		System.out.println("사요나라");
	}
	
	public String toString(){
		return "저는 일본사람 " + super.getName() + "입니다.";
	}
}
