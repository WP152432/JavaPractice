/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_ IDBManager.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public interface IDBManager {
	 String ORACLE_DATABASE = "ORACLE";
	 String SYBASE_DATABASE = "SYBASE";
	
	void insert();
	void search();
	void update();
	void delete();
	public static IDBManager getDBObject(String database){
		if(ORACLE_DATABASE.equals(database)){
			OracleDB ODB = new OracleDB();
			return ODB;
		}
		else if(SYBASE_DATABASE.equals(database)){
			SybaseDB SDB = new SybaseDB();
			return SDB;
		}
		else{
			return null;
		}
	}
}
