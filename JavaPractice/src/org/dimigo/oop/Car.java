/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Car.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class Car {
	
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public void setCompany(String re_company){
		company = re_company;
	}
	
	public void setModel(String re_model){
		model = re_model;
	}
	
	public void setColor(String re_color){
		color = re_color;
	}
	
	public void setPrice(int re_price){
		price = re_price;
	}
	
	public void setMaxSpeed(int re_maxSpeed){
		maxSpeed = re_maxSpeed;
	}
	
	public String getCompany(){
		return company;
	}
	
	public String getModel(){
		return model;
	}
	
	public String getColor(){
		return color;
	}
	
	public int getMaxSpeed(){
		return maxSpeed;
	}
	
	public int getPrice(){
		return price;
	}
}
