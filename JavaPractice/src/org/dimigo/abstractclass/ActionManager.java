/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.abstractclass
 *   |_ ActionManager.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 18.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class ActionManager {

	/**
	 * @param args
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	
	public static final String PKG_NAME = "org.dimigo.abstractclass.";
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		
		if(args == null || args.length == 0){
			return;
		}
		
		System.out.println(args[0]);
		
		// Insert => new InsertAction().execute();
		// Delete -> new DeleteAction().execute();
		// Update => new UpdateAction().execute();
		
		Action action = getAction2(args[0]);
		action.execute();
	}

	//객체를 정적으로 생성 (new InsertAction())
	private static Action getAction(String actionName){
		if("Insert".equals(actionName)){
			return new InsertAction();
		}else if("Delete".equals(actionName)){
			return new DeleteAction();
		}
		else if("Update".equals(actionName)){
			return new UpdateAction();
		}
		else{
			return null;
		}
	}
	
	
	private static Action getAction2(String actionName) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		Class cls = Class.forName(PKG_NAME+actionName + "Action");
		Action action = (Action) cls.newInstance();
		
		return action;
	}
}
