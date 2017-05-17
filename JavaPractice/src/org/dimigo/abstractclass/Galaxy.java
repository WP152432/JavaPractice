/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ Galaxy.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 15.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class Galaxy extends SmartPhone {
	public Galaxy(){
		
	}
	
	public Galaxy(String model, String company, int price){
		super(model,company,price);
	}
	
	public void pay(){
		System.out.println(super.company + " 페이로 결제합니다.");
	}
	public void useWirelessCharging(){
		System.out.println("무선 충전 기능을 이용합니다.");
	}
}
