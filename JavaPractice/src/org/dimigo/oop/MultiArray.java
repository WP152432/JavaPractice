/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ MultiArray.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 7.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class MultiArray {

	/**
	 * @param args
	 */
	public void printArr(int[][] arr){
		for(int i =0 ; i< arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j] + "!");
			}
			System.out.println();
		}
	}
	
	public void printArr(String[][] arr){
		for(int i =0 ; i< arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j] + "!");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intArr = new int[2][3];
		
		
		MultiArray obj = new MultiArray();
		obj.printArr(intArr);
		
		intArr[0][0] = 100;
		obj.printArr(intArr);
		intArr[1][2] = 100;
		obj.printArr(intArr);
		
		String[][] strArr = new String[2][];
		strArr[0] = new String[3];
		strArr[1] = new String[2];
		obj.printArr(strArr);
		strArr[0][0] = "금요귀가";
		obj.printArr(strArr);
	}

}
