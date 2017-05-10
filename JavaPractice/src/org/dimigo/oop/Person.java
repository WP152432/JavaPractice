/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Person.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 20.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class Person {
	private final String type = "포유류";
	private final String birthDt;
	private String name;
	
	public static final String TYPE = "포유류";
	
	
	public Person(String birthDt, String name){
		this.birthDt = birthDt;
		this.name = name;
	}

	public String toString() {
		return "Person [type=" + type + ", birthDt=" + birthDt + ", name=" + name + "]";
	}
	
	public static void main(String[] args){
		Person p1 = new Person("20000419","한재희");
		Person p2 = new Person("20000410","정진호");
		
		System.out.println(p1);
		System.out.println(p2);
		
	}
}
