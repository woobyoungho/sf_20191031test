package com.hk.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class OracleDAO {
	
	private static OracleDAO dao = null;
	
	private OracleDAO() {
		
	}
	
	public static OracleDAO getInstance() {
		if(dao == null) {
			dao = new OracleDAO();
		}
		return dao;
	}

	public Connection getConn() throws Exception {
		Class.forName("oracle.jdbc.OracleDrive");
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pw = "hkitedu";
		
		Connection con = DriverManager.getConnection(url, user, pw);
		return con;
	}
}
