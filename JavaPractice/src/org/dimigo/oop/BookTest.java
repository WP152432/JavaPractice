/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ BookTest.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class BookTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book = new Book();
		book.setTitle("Rail in Rain is Ruined.");
		book.setAuthor("Grass,Mith");
		book.setPage(22131);
		
		System.out.println(book.getTitle());
		System.out.println(book.getPage());
		System.out.println(book.getAuthor());
		
		Book book2 = new Book();
		book2.setTitle("Brain like Grain is Falling like Rain");
		book2.setAuthor("Grass,hope");
		book2.setPage(23212);
		
	}

}
