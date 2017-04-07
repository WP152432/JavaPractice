/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ ArrayBasic.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 6.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class ArrayBasic {

	/**
	 * @param args
	 */
	public void printArray(int[] arr){
		for(int value: arr){
			System.out.print(value+"!");
		}
		System.out.println();
	}
	
	public void printArray(String[] arr){
		for(String value: arr){
			System.out.print(value+"!");
		}
		System.out.println();
	}
	
	public void printArray(Book[] arr){
		for(Book value: arr){
			System.out.print("책제목 : "+value.getTitle()+"작가 : "+value.getAuthor()+"페이지수 : "+value.getPage());
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = null;
		intArr = new int[5];
		
		ArrayBasic ab = new ArrayBasic();
		
		ab.printArray(intArr);
		ab.printArray(intArr);
		
		int[] intArr2 = {1,2,3,4,5};
		ab.printArray(intArr2);
		
		String[] strArr = new String[5];
		ab.printArray(strArr);
		
		String[] strArr2 = {"아이유","아이린","은아",null,null};
		
		ab.printArray(strArr2);
		
		Book[] bookArr = new Book[2];
		bookArr[0] = new Book("칼 세이번",720,"코스모스");
		bookArr[1] = new Book("작가 미상",300,"Effetive-C++");
		ab.printArray(bookArr);
		
		int[] intArr3 = null;
		System.out.println(intArr3);
		
		intArr3 = new int[3];
//		System.out.println(intArr3[4]);
		String[] strArr3 = new String[3];
//		System.out.println(strArr3[0].length());
		Book[] bookarr3 = new Book[3];
//		System.out.println(bookarr3[0].getTitle());
		
		
		int[] scores = new int[]{100,90,80,70};
		int sum = 0;
		for(int i=0;i<scores.length;i++){
			sum += scores[i];
		}
		System.out.println("총합 : "+sum);
		System.out.println("평균 : "+sum/scores.length);
	}

}
