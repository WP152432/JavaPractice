/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *   |_ ThrowException.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 30.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class ThrowException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			methodA(null, 0);
			System.out.println("이후로직");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void methodA(String s,int i) throws Exception{
		methodB(s,i);
	}
	
	private static void methodB(String s, int i) throws Exception{
		if(s == null || s.equals("")){
			// 예외를 직접 발생 (예외 객체를 생성해서 던진다는 것)
			throw new Exception("문자열을 입력하세요.");
		}
		System.out.println(s.length());
		
		if(i == 0){
			throw new Exception("0으로 나눌 수 없습니다.");
		}
		System.out.println(100/1);
	}

}
