package org.dev;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.core.tutorial.mongo.DBOConn;



public class Testing {
	
	private static Connection conn=null;
	private static ResultSet rs=null;
	private static PreparedStatement ps=null;
	
	public static void main(String[] args) throws SQLException {
			try {
				conn=DBOConn.getConnection();
				ps=conn.prepareStatement("SELECT * FROM JCR_REP_FSENTRY");
				rs=ps.executeQuery();
				while(rs.next()) {
					String str=rs.getString("FSENTRY_NAME");
					System.out.println("name: "+str);
				}
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				conn.close();
			}
	}
}
