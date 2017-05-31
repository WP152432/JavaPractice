/**
 * 
 */
package org.dimigo.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * <pre>
 * org.dimigo.exception
 *   |_ ExampleException.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 26.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class ExampleException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Unchecked Exception : 컴파일러가 강제로 예외처리를 요구하지않음.
		// 개발자가 주의해서 예외처리를 해줘야 함.
		try{unchecked("hello");
			checked();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	private static void unchecked(String s) throws Exception{
		try{
			if(s == null){
				throw new Exception("문자열이 입력되지 않았습니다.");
			}
			else if(s.length() < 5){
				throw new Exception("문자열의 길이는 5 이상이어야 합니다.");
			}
			
			System.out.println(s.substring(0,5));
		}
		catch(Exception e){
			// 예외 처리 추가
			throw e;
		}
	}
	
	private static void checked() throws Exception{
		
		BufferedReader br = null;
		try{
	/*		InputStream is = System.in;
			Reader reader = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(reader);*/
			
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("입력값 => ");
			// Checked Exception : 컴파일러가 강제로 예외처리를 요구함.
			String str = br.readLine();
			System.out.print("출력 값 => "+str);
			
		}
		catch(IOException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
			throw e;
		}
		finally{
			br.close();
		}
	}
}
