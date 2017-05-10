/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ AnimalTest.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 8.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class AnimalTest {
	public static void main(String[] args) {
		Animal a = new Animal("동물");
		System.out.println(a);
		
		Dog d = new Dog("멍멍이");
		System.out.println(d);
		d.bark(); // Dog 에 있는 Bark 메소드 호출.
		d.wag();
		
		Cat c = new Cat("야옹이");
		System.out.println(c);
		c.bark();
		c.scratch();
		
		Tiger t = new Tiger("호돌이");
		System.out.println(t);
		t.bark();
		t.hunt();
	}

}
