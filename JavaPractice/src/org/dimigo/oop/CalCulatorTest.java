/**
 * 
 */
package org.dimigo.oop;

public class CalCulatorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Calculator.PI);
		Calculator calc = new Calculator();
		System.out.println("10 + 20 = " + Calculator.add(20,30,calc));
		System.out.println("10 - 20 = " + Calculator.sub(20,30));
		System.out.println("10 * 20 = " + Calculator.mul(20,30));
		System.out.println("10 / 20 = " + Calculator.div(20,30));
		Calculator cal = new Calculator(10,20);
		System.out.println(cal);
		cal.PowerOn();
		System.out.println("10 + 20 = " + Calculator.add(20,30,calc));
		System.out.println("10 - 20 = " + Calculator.sub(20,30));
		System.out.println("10 * 20 = " + Calculator.mul(20,30));
		System.out.println("10 / 20 = " + Calculator.div(20,30));
		cal.PowerOff();
	}

}