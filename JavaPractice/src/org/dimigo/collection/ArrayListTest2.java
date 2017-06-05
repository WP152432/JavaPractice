/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.dimigo.interfaces.Cat;
import org.dimigo.interfaces.Dog;
import org.dimigo.interfaces.IAnimal;

/**
 * <pre>
 * org.dimigo.collection
 *   |_ ArrayListTest2.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 6. 5.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class ArrayListTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<IAnimal> list = new ArrayList<IAnimal>();
		
		list.add(new Dog());
		list.add(new Cat());
		
		List<String> list2 = Arrays.asList("아이유","싸이","도끼");
		List<IAnimal> list3 = Arrays.asList(new Dog(),new Cat());
		
		bark(list3);
		bark(list);
		
		// list -> array
		
		IAnimal[] arr = new IAnimal[list.size()];
		list.toArray(arr);
		
		List<IAnimal> list4 = Arrays.asList(arr);
	}

		private static void bark(List<IAnimal> list){
			for(IAnimal a : list){
				a.bark();
			}
		}
}
