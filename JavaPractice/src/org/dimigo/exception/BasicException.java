/**
 * 
 */
package org.dimigo.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.exception
 *   |_ BasicException.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 29.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class BasicException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//JVM 이 예외 객체를 받으면 에러 메세지를 출력해주고, 프로그램을 종료시킨다.
		System.out.println("입력한 숫자 : " + input4());
	}
	
	public static int input(){
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("숫자 입력 => ");
			int n = scanner.nextInt(); // 예외 발생 (예외 개체를 생성해서 던짐)
			
			scanner.close();
			return n;
	}
	
	public static int input2(){
		try{
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("숫자 입력 => ");
			int n = scanner.nextInt(); // 예외 발생 (예외 개체를 생성해서 던짐)
			
			scanner.close();
			return n;
		}catch(InputMismatchException ime){
			// new InputMismatchException ime = new InputMismatchException();
			// 예외 처리 코드
			
			System.out.println("숫자를 입력하세요.");
			
			return 0;
		}
	}
	
	// try~catch finally 구문
	public static int input3(){
		Scanner scanner = null;
		try{
			scanner = new Scanner(System.in);
			
			System.out.print("숫자 입력 => ");
			int n = scanner.nextInt(); // 예외 발생 (예외 개체를 생성해서 던짐)
			
			return n;
		}catch(InputMismatchException ime){
			// new InputMismatchException ime = new InputMismatchException();
			// 예외 처리 코드
			
			System.out.println("숫자를 입력하세요.");
			
			return 0;
		}finally{
			// 예외 발생 여부와 상관없이 무조건 실행되는 코드.
			System.out.println("finally 구문 실행");
			scanner.close();
		}
	}
	
	// try 블록에서 다른 exception 이 발생한다면?
	public static int input4(){
		Scanner scanner = null;
		try{
			scanner = new Scanner(System.in);
			
			System.out.print("숫자 입력 => ");
			int n = scanner.nextInt(); // 예외 발생 (예외 개체를 생성해서 던짐)
			
			String s = null;
			System.out.println(s.length());
			
			return n;
		}catch(InputMismatchException ime){
			// new InputMismatchException ime = new InputMismatchException();
			// 예외 처리 코드
			
			System.out.println("숫자를 입력하세요.");
			
			return 0;
		}catch(Exception npe){
			System.out.println("알수없는 오류입니다.");
			return 0;
		}
		finally{
			// 예외 발생 여부와 상관없이 무조건 실행되는 코드.
			System.out.println("finally 구문 실행");
			scanner.close();
		}
	}

}
