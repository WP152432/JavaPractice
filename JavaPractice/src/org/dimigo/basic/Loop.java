/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ Loop.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 15.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int atk = 100;
		int _class_index = 0;
		String[] _class = {"마법사" , "영주", "기사", "농민"};
		int choice = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		
		do{
			System.out.println("");
			System.out.println("------------");
			System.out.println("");
			System.out.println("<< 게임 메뉴 >>");
			System.out.println("1. 공격력 증가");
			System.out.println("2. 공격력 감소");
			System.out.println("3. 캐릭터 설정");
			System.out.println("9. 종료");
			System.out.println("");
			System.out.println("------------");
			System.out.println("");
			System.out.println("메뉴 입력 ->");
			choice = scanner.nextInt();
			
			switch(choice){
			case 1:
				atk+=10;
				System.out.println("공격력이 증가되었습니다. 현재 공격력 : "+atk);
				break;
			case 2:
				atk-=10;
				System.out.println("공격력이 감소되었습니다. 현재 공격력 : "+atk);
				break;
			case 3:
				_class_index = new Random().nextInt(4);
				System.out.println(_class[_class_index]+"(으)로 설정되었습니다.");
				break;
			default:
				System.out.println("없는 메뉴입니다.");	
			}
		}while(choice != 9);
			
		System.out.println("이제 공부하세요!");
	}

}
