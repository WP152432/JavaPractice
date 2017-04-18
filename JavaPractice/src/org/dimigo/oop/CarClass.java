/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ CarClass.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 17.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class CarClass {

	/**
	 * @param args
	 */
	
	private static String company;
	private String name;
	public CarClass(String name){
		this.name = name;
	}
		/**
		 * @return the company
		 */
		
		// 스태틱 메소드에서 스태틱 필드 호출.
		public static String getCompany() {
			return company;
		}
		/**
		 * @param company the company to set
		 */
		public static void setCompany(String company) {
			CarClass.company = company;
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
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		
		public String toString() {
			return company + " : " + name;
		}
		
}
