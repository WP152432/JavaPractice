/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.abstractclass
 *   |_ Duck.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 17.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class Duck extends Animal {
	
	@Override
	public void bark(){
		System.out.println("꽥꽥!!");
	}
}