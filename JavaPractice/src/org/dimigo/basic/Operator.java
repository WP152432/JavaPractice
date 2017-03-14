/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ Operator.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 14.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long salary = 1700000l;
		long employee = 3l;
		long shops = 1500l;
		long anual = salary*employee*shops*12;
		
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.printf("월 평균 급여 : %,d원\n",salary);
		System.out.println("점포 내 직원 수 : "+employee+"명");
		System.out.printf("점포 수 : %,d개\n",shops);
		System.out.printf("\n\n");
		System.out.printf("연간 인건비 : %,d",anual);
	}

}
