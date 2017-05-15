/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ AnimalTest2.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 12.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class AnimalTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a = new Cat("야옹이");
		//a.scratch(); 컴파일 시에는 타입 기준으로 체크한다.
		a.bark();
		
		// 자식 클래스 타입으로 강제 형변환.
		
		Cat c = (Cat) a;
		c.scratch();
		
		
		Animal a1 = new Dog("멍멍이");
		Animal a2 = new Cat("야옹이");
		
		System.out.println(a1 instanceof Dog);
		System.out.println(a2 instanceof Cat);
		System.out.println(a1 instanceof Cat);
		System.out.println(a2 instanceof Dog);
		System.out.println(a1 instanceof Animal);
		System.out.println(a2 instanceof Animal);
		
		func(a1);
		func(a2);
	}
	
	private static void func(Animal a){
		
		if(a == null) return;
		
		if(a instanceof Dog){
			((Dog) a).wag();
		}
		else if(a instanceof Cat){
			((Cat) a).scratch();
		}
		else if(a instanceof Tiger){
			((Tiger) a).hunt();
		}
	}

}
