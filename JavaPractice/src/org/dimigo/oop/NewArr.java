/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ NewArr.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 10.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class NewArr {
	public static void main(String[] args) {
		int [][] intArr4 = {
				new int[]{1,2,3},
				new int[]{4,5,6},
		};
		
		NewArr obj = new NewArr();
		
		obj.printArr(intArr4);
		
	}
	
	public void printArr(int arr[][]){
		int i,j;
		
		for(i=0;i<2;i++){
			for(j=0;j<3;j++){
				System.out.println(arr[i][j]);
			}
		}
	
	}
}
