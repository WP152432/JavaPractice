/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Book.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class Book {
	
	private String author;
	private int page;
	private String name;
	
	// Constructor;
	
	public Book(){
		System.out.println("기본 생성자");
	}
	
	public Book(String author,int page,String name){
		this.author = author;
		this.page = page;
		this.name = name;
		
	}
	
	public Book(String re_author,String re_name){
		author = re_author;
		name = re_name;
		
	}
	
	public Book(String title){
		this(title, "저자 미상");
	}
	
	public String getTitle(){
		return name;
	}
	
	public int getPage(){
		return page;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public void setTitle(String re_name){
		name = re_name;
	}
	
	public void setPage(int re_page){
		page = re_page;
	}
	
	public void setAuthor(String re_author){
		author = re_author;
	}
}
