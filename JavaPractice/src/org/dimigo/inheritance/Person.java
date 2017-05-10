/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ Person.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 24.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class Person {
	public String name;
	protected int age;
	int height;
	private int weight;
	
	
	public Person(){
		this.name = "";
		this.age = 0;
		this.height = 0;
		this.weight = 0;
	}
	
	public Person(String name, int age, int height,int weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public void eat(){
		System.out.println(name + "(이)가 밥을 먹는다.");
	}
	
	public void sleep(){
		System.out.println(name + "(이)가 잠을 잔다.");
	}

	public String toString() {
		return "name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight;
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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}
}
