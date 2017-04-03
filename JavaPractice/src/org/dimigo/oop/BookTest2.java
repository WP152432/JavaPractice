/**
 * 
 */
package org.dimigo.oop;

public class BookTest2 {
	private void compare(){
		int a = 10;
		int b = a;
		
		Book book = new Book("미생",1000,"윤태호");
		Book book2 = book;
		
		book2.setTitle("자바를 잡아라");
		
		System.out.println(book.getTitle());
	}
	
	private void changePrimitive(int num){
		num += 10;
		System.out.println(num);
	}
	
	private void changeReference(Book book){
		System.out.println(book.getTitle());
		book = new Book("이것이 자바다");
		System.out.println(book.getTitle());
	}
	
	private void changeAttribute(Book book){
		System.out.println(book.getTitle());
		book.setTitle("이것이 자바다 2");
		System.out.println(book.getTitle());
	}
	
	public static void main(String[] args) {
		BookTest2 bookTest = new BookTest2();
		bookTest.compare();
		
		Book book = new Book("미생");
		
		System.out.println("-------------------------------------------");
		
		int num = 5;
		bookTest.changePrimitive(num);
		System.out.println(num);
		
		System.out.println("-----------------------------------");
		
		bookTest.changeReference(book);
		System.out.println(book.getTitle());
		bookTest.changeAttribute(book);
		System.out.println(book.getTitle());
		
		Book book2 = null;
		System.out.println(book2);
//		System.out.println(book2.getTitle());
		
		book2 = new Book();
		
		System.out.println(book2);
		System.out.println(book2.getTitle());
		System.out.println(book2.getTitle().length());
	}
	
}
