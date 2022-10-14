package com.kiranacademy.jdbc;

import java.sql.Connection;
import java.sql.Statement;

import p1.ConnectionUtility;

public class StatementEx {
	
	// To run this application
	// 1. select run configuartion from run menu
	// 2. select arguments tab and provide 3 values separated by space
	// String[] args ==> {"11","robert","10000"};

	public static void main(String[] args) throws Exception {
		
		Connection con=ConnectionUtility.getConnection();
		
		System.out.println("connected");
		
		Statement st=con.createStatement();
			
		System.out.println("insert into employee values("+args[0]+",'"+args[1]+"',"+args[2]+")");
		
		st.executeUpdate("insert into employee values("+args[0]+",'"+args[1]+"',"+args[2]+")");
		
		// insert into employee values(11,'robert',10000)
		
	}
}
