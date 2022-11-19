package com.estore.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DB {	
	
	
	public Connection connection;
	

  private static DB db = new DB();

   private DB() {
 
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost/eoffice";
		String user = "root";
		String password = "ilovekenneth!174";
		connection = DriverManager.getConnection(url, user, password);
	
	}catch (Exception e) {
		//System.out.println("Exception Occurred; "+e);
		 e.printStackTrace();
	
	}    
  }	
  
 
     public static DB getDB() {
 	 return db;
  } 
     
     //insert, update and delete
     public int executeUpdate(PreparedStatement statement) {
     int result = 0;
     try {
    	 result = statement.executeUpdate();
     }catch (Exception e) {
    	 e.printStackTrace();
     }
     return result;
 }
 
     
   public ResultSet executeQuery(PreparedStatement statement) {
     ResultSet set = null;
     try {
    	 set = statement.executeQuery();
     }catch (Exception e) {
    	 e.printStackTrace();
     }
     return set;  
 }
 
  
 public void closeConnection() {
      try {
    	  connection.close();
      }catch (Exception e) {
  	    e.printStackTrace();
       }
     }
}