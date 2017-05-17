/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.abstractclass
 *   |_ AnimalTest.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 17.
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
//		Animal a = new Animal();
		
		Animal[] animals = {
				new Cow(),new Pig(), new Duck()
		};
		
		System.out.println("== 평온한 동물농장 ==");
		
		for(Animal a : animals){
			a.sleep();
		}
		
		System.out.println("== 늑대가 나타났다 ==");
		
		for(Animal a : animals){
			a.bark();
		}
	}

}
