package com.web.p02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "C##TESTER";
		String pwd = "r1r2r3r4";
		
		try {
			Connection con = DriverManager.getConnection(url, id, pwd);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM USER_INFO");
			while(rs.next()) {
				System.out.println(rs.getString("UI_NUM"));
				System.out.println(rs.getString("UI_NAME"));
				System.out.println(rs.getString("UI_ID"));
				System.out.println(rs.getString("UI_PWD"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
