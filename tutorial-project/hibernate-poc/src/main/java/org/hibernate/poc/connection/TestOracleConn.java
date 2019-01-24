package org.hibernate.poc.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestOracleConn {
	
	private static Connection conn=null;
	private static ResultSet rs=null;
	private static PreparedStatement ps =null;
	
	
	public static void main(String[] args) {
		try {
			conn=DBConn.getConnection();
			ps=conn.prepareStatement("insert into TUTOUSER.TEST(name,phone) values(?,?)");
			ps.setString(1, "Sudhir");
			ps.setInt(2, 123456);
			ps.execute();
			System.out.println("Inserted Successfully");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
