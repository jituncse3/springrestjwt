package com.nse.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtils {
	private final static String url = "jdbc:oracle:thin:@//172.17.106.48:1541/neapsora";
	private final static String user = "neapsdba";
	private final static String password = "abcd1234";

	public static Connection getConnection() {
		Connection conn = null;
		try {
			System.out.println("dhbfvhj");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connected to the Oracle server successfully."+conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return conn;
	}
}
