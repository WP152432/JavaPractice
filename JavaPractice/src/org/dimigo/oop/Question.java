/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Question.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 3.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] correct = {"빅뱅","공유","응용 프로그래밍"};
		String[] question = {"가수", "배우", "과목"};
		String[] answer = {"","",""};
		
		int i;
		
		for(i=0;i<3;i++){
			System.out.println("가장 좋아하는 "+question[i]+"?");
			answer[i] = scanner.nextLine();
			
			if(correct[i].equals(answer[i])){
				System.out.println("정답입니다!");
			}
			else{
				System.out.println("틀렸습니다!");
			}
		}
		System.out.println("<< 결과 출력 >>");
		for(i=0;i<3;i++){
			System.out.println(new StringBuilder("가장 좋아하는 ").append(question[i]).append("?").append(answer[i]).append("입니다."));
		}
		
	}

}
