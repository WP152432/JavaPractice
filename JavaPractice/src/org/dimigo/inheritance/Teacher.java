/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ Teacher.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 24.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class Teacher extends Person{
	
	private String subject;
	
	public Teacher(String name, int age, int height,int weight, String subject){
		super(name,age,height,weight);
		this.subject = subject;
	}
	
	public void teach(){
		System.out.println(super.getName()+"쌤이 공부를 가르칩니다.");
	}
	
	public void doTask(){
		System.out.println(super.getName()+"쌤이 일을 합니다.");
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Teacher [subject=" + subject + "," + super.toString() + "]";
	}
	
	

}
