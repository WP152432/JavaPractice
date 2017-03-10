/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ PrimitiveDataType.java
 *
 * 1. 개요 : 아이유 프로필 출력하기.
 * 2. 작성일 : 2017. 3. 9.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class PrimitiveDataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "아이유";
		boolean isMale = false;
		int age = 25;
		double height = 161.8;
		float weight = 48.3f;
		char bloodType = 'A';
		
		System.out.printf("<< 아이유 프로필 >>\n이름 : %s\n",name);
		System.out.println(isMale ? "성별 : 남자\n":"성별 : 여자\n");
		System.out.printf("나이 : %d세\n키 : %.1fcm\n몸무게 : %.1fkg\n혈액형 : %c형",age,height,weight,bloodType);
	}

}
