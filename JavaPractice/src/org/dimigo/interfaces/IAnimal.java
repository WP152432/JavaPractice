/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_ IAnimal.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 24.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public interface IAnimal {

		public static final String SCHOOL = "디미고";
		String FARM_NAME = "디미 농물농장";
		
//		public abstract void eat();
//		void sleep();
		void bark();
		
		static void welcome(){
			System.out.println(FARM_NAME + "에 오신걸 환영합니다.");
		}
		
		default void eat(){
			System.out.println("냠냠");
		}
		
		default void sleep(){
			System.out.println("쿨쿨");
		}
}
