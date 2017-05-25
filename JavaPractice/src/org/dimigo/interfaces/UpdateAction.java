/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_ InsertAction.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class UpdateAction implements IAction{
	
	public void execute(){
		System.out.println("데이터를 수정합니다.");
	}

}
