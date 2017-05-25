/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_ AnimalTest.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 24.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class AnimalTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IAnimal[] animals = {
				new Dog(), new Cat()
		};
		
		for(IAnimal a : animals){
			doAction(a);
		}
		
		IAnimal tiger = new IAnimal(){
			public void bark(){
				System.out.println("어흥");
			}
		};
		
		doAction(tiger);
	}

	private static void doAction(IAnimal a){
		System.out.println(a.getClass().getName());
		System.out.println(a.getClass().getSimpleName());
		a.eat();
		a.sleep();
		a.bark();
		
		if(a instanceof Dog){
			((Dog) a).wag();
		}
		System.out.println();
	}
}
