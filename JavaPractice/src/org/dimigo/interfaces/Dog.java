/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_ Dog.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 24.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class Dog implements IAnimal{

	/**
	 * @param args
	 */
	/* (non-Javadoc)
	 * @see org.dimigo.interfaces.IAnimal#eat()
	 */
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("냠냠");
		
	}

	/* (non-Javadoc)
	 * @see org.dimigo.interfaces.IAnimal#sleep()
	 */
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("쿨쿨");
	}

	/* (non-Javadoc)
	 * @see org.dimigo.interfaces.IAnimal#bark()
	 */
	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("냐옹");
	}

	public void wag(){
		System.out.println("꼬리를 흔들다.");
		
	}
}
