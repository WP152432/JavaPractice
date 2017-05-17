/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ SmartPhone.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 15.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public abstract class SmartPhone {
	protected String model;
	protected String company;
	protected int price;

	public SmartPhone(){
		model = "";
		company = "";
		price = 0;
	}
	
	public SmartPhone(String model, String company, int price){
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	public void turnOn(){
		System.out.println(model + "의 전원을 켭니다.");
	}
	
	public void turnOff(){
		System.out.println(model + "의 전원을 끕니다.");
	}
	
	public abstract void pay();
	
	public void useSpecialFunction(){
		if(this == null){
			return;
		}
		
		if(this instanceof Galaxy){
			((Galaxy) this).useWirelessCharging();
		}
		else if(this instanceof IPhone){
			((IPhone) this).useAirDrop();
		}
	}
	
	public String toString(){
		String priceString = String.format("%,d",price);
		return "모델명 : "+model+ ", 제조사 : "+company + ", 가격 : " + priceString + "원";
	}
}
