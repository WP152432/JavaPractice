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
public class Car3 {
	
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public Car3(String re_company,String re_model, String re_color, int re_maxSpeed, int re_price){
		company = re_company;
		model = re_model;
		color = re_color;
		maxSpeed = re_maxSpeed;
		price = re_price;
	}
	
	public Car3(String re_company,String re_model, String re_color, int re_maxSpeed){
		this(re_company, re_model, re_color,re_maxSpeed,0);
		company = re_company;
		model = re_model;
		color = re_color;
		maxSpeed = re_maxSpeed;
	}
	
	public Car3(String re_company,String re_model, String re_color){
		this(re_company,re_model,re_color,0,0);
		company = re_company;
		model = re_model;
		color = re_color;
	}
	
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
