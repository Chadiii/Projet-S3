package com.JavaEE.BD;

import java.sql.Connection;
import java.sql.DriverManager;

import com.JavaEE.bdd.BDconnect;



public  class SingletonConnection {
	private static Connection connection;
	static String test;
	
	
	
	static {
		
			try {
				String jdbcUrl= "jdbc:mysql://localhost:3306/javaee?characterEncoding=latin1&useSSL=false&serverTimezone=UTC";
				String user= "root";
				String pass= "lol123456love";
				
				Class.forName("com.mysql.jdbc.Driver");
				connection=DriverManager.getConnection(jdbcUrl, user, pass);
				test = "Connection successfull";
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	   }
	public static Connection getConnection() {
		  return connection;
	}
	
	public static void main (String[] args){
		System.out.println(test);
		BDconnect a = new BDconnect();
		
		
		System.out.println(a.getDataModel("model"));
		}
		
	}


	


