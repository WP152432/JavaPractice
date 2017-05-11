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
		
		Animal a1 = new Dog("멍멍이");
		a1.bark();
		
		Animal a2 = new Cat("야옹이");
		a2.bark();
		
		Animal a3 = new Tiger("호돌이");
		a3.bark();
		
		Animal animals[] = {a1,a2,a3};
		for(Animal i:animals){
			doBark(i);
		}
	}
	
	private static void doBark(Animal animal){
		System.out.println(animal);
		animal.bark();
	}

}
