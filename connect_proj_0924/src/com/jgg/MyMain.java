package com.jgg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyMain {
	public static void main(String[] args) {
	String url = "jdbc:mariadb://localhost:3306/employees";
	String user = "root";
	String password = "1234";
	
	try {
		Class.forName("org.mariadb.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection(url, user, password);
		System.out.println("MariaDB 연결 성공!");
		
		conn.close();
	} catch (ClassNotFoundException e) {
		System.out.println("드라이브 로드 실패: " + e.getMessage());
	} catch (SQLException e) {
		System.out.println("DB 연결 실패: " + e.getMessage());
	}
}
}
