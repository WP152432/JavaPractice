/**
 * 
 */
package org.dimigo.oop;

public class Calculator {
	public static double PI = 3.141592;
	private int num1;
	private int num2;
	private boolean powerFlag = false;
	
	
	public Calculator(){
		this(0, 0);
	}
	
	public Calculator(int reNum1, int reNum2){
		num1 = reNum1;
		num2 = reNum2;
	}
	public void PowerOn(){
		System.out.println("전원을 켭니다.");
		powerFlag = true;
	}
	
	public void PowerOff(){
		if(this.powerFlag){
			System.out.println("전원을 끕니다.");
		}
	}
	
	// 정적 메소드
	public static int add(int num1, int num2,Calculator calc){
		calc.PowerOn();
		return num1 + num2;
	}
	
	public static int sub(int num1, int num2){
		return num1 - num2;
	}
	
	public static int mul(int num1, int num2){
		return num1*num2;
	}
	
	public static double div(int num1, int num2){
		return (double)num1 / (double)num2;
	}
}
