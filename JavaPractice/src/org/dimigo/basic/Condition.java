/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ Condition.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 14.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class Condition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. if-else문
		// 선거권 연령 : 만 19세
		int age = 17;
		
		if(age >= 19){
			System.out.println("투표하러 가세여");
		}
		else{
			System.out.println("선거권이 읎어요");
		}
		
		// 2. switch;
		// 주사위 랜덤값 뽑기 (1~6)
		
		System.out.println(new Random().nextInt(6)+1);
		
		int num = new Random().nextInt(6)+1;
		switch(num%2){
		case 0:
			System.out.println("짝수입니다.");
			break;
		case 1:
			System.out.println("홀수입니다.");
		}
		
	}
	

}
