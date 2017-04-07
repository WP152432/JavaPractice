/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Snack.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 6.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class Snack {

	private String name = "";
	private String company = "";
	private int price = 0;
	private int number = 0;

	public Snack(){
	}
	
	public Snack(String name, String company, int price, int number){
		this.name = name;
		this.company = company;
		this.price = price;
		this.number = number;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the compnay
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param compnay the compnay to set
	 */
	public void setCompany(String compnay) {
		this.company = compnay;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int calcPrice(){
		int sum = number * price;
		return sum;
	}
	
	public String toString(){
		System.out.println("이름 : " + name);
		System.out.println("제조사 : " + company);
		System.out.print("가격 : " + String.format("%,d", price)+"원\n");
		System.out.println("개수 : " + number + "개 ");
		return "";
	}

}
