package org.core.tutorial.mongo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBOConn {
	static{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(ClassNotFoundException cnf){
			cnf.printStackTrace();
		}
	}
	
		public static Connection getConnection(){
			Connection conn=null;
			try{
				//conn=DriverManager.getConnection("jdbc:oracle:thin:@192.168.214.144:1577:dev1201","RCDEFARCD1","RCDEFARCD1");
				conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:rcde","system","root");
			}
			catch(SQLException ex){
				ex.printStackTrace();
			}
			return conn;
		}	
}
