/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ PersonTest.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 24.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class PersonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("아이유",25,162,44);
		System.out.println(p);
		p.eat();
		p.sleep();
		p.eat();p.sleep();p.eat();p.sleep();p.eat();p.sleep();p.eat();p.sleep();p.eat();p.sleep();p.eat();p.sleep();
		
		
		System.out.println();
		System.out.println();
		
		Student s = new Student("한종걸",18,176,70,"2436");
		System.out.println(s);
		
		s.study();
		s.eat();
		s.eatSnack();
		s.sleep();
		
		Teacher t = new Teacher("하미영",30,165,48,"응용프로그래밍");
		System.out.println(t);
		
		t.teach();
		t.doTask();
		
		t.eat();
		t.sleep();
	}
}
