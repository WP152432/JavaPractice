/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ CarClassTest.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 17.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class CarClassTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarClass[] cars = {
				new CarClass("제네시스"),
				new CarClass("에쿠스"),
				new CarClass("소나타")
		};
		
		for(CarClass car:cars){
			car.getName();
			car.getCompany();
		}
	}

}
