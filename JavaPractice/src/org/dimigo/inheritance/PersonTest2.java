/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimicorporation.oop
 *   |_ PersonTest.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 10.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class PersonTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person[] people = {new Person("Tom"),new Korean("홍길동"),new Japanese("다나카"),new Chinese("왕밍")};
		
		for(Person person : people){
			greeting(person);
		}
		
	}
	
	private static void greeting(Person p){
		System.out.println(p);
		p.sayHello();
		p.sayBye();
		System.out.println();
	}

}
