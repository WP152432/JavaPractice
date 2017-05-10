/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Singletone.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 20.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class Singletone {
	// 싱글 톤 객체를 하나만 만들자
	private static Singletone instance;
	
	private Singletone(){}
	
	public static Singletone getInstance(){
		return instance;
	}
	// 필요한 시점에 객체를 생성하는 방식 (lazy 객체 생성 방식)
	
	public static synchronized Singletone getInstance2(){
		if(instance == null){
			return new Singletone();
		}
		else
			return instance;
	}
	
}