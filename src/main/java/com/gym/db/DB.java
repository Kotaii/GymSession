package com.gym.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import com.gym.model.Participant;


public class DB implements DAO{

	Connection connection;
	Statement statement;
	PreparedStatement preparedStatement;
	

   
    
    
	final String TAG = getClass().getSimpleName();
	
	public DB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(TAG+" Driver Loaded");
					
		} catch (Exception e) {
			System.out.println("Exception Occurred; "+e);
		}
		
	}


	public void createConnection() {
		try {
		     String user = "root";
		     String password = "ilovekenneth!174";
		     String url ="jdbc:mysql://localhost/estore";
		     
		     connection = DriverManager.getConnection(url, user, password);
		     System.out.println(TAG+" Connection Created");
			
			  
		} catch (Exception e) {
			System.out.println("Exception Occured: "+e);
		}		
	}

	public void closeConnection() {
		try {
			connection.close();
			System.out.println(TAG+" Connection Close. Close Status: "+connection.isClosed());
		} catch (Exception e) {
		
		System.out.println("Exception Occured: "+e);
	    }
	}


		




	@Override
	public void updateParticipant(Participant participant) {
		// TODO Auto-generated method stub
		
	}



	
	public void deleteParticipant(int cid) {
		
    	try {
    		String sql = "delete from Participant where cid = "+cid;
        	preparedStatement = connection.prepareStatement(sql);
        	preparedStatement.setInt(1, cid);
        	int result = preparedStatement.executeUpdate();
    	
    		String message = result > 0 ? "Customer Deleted Successfully" : "Customer Not Created. Please Try Again";
    		System.out.println(TAG+message);
    	
    	
    	
    	} catch (SQLException e) {
    		
    		System.out.println("Exception Occurred: "+e);
			
		}
    	
		
	}
     

    public void createParticipant(Participant participant) {
    	
    	try {
    		
    		String sql = "insert into Participant values(null, ?, ?, ?)";
    		System.out.println("SQL is: "+sql);
    		
    		preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, participant.getName());
            preparedStatement.setString(2, participant.getEmail());
            preparedStatement.setString(3, participant.getPhone());
            
            int result = preparedStatement.executeUpdate();
            
    		//System.out.println("SQL is: "+sql);
    		
    		statement = connection.createStatement();
    	
    		
    		preparedStatement.setString(1, participant.getName());
    		preparedStatement.setString(2, participant.getPhone());
    		preparedStatement.setString(3, participant.getEmail());

    		
    		
    		//int result = statement.executeUpdate(sql);
    		
    		String message = result > 0 ? "Customer Created Successfully" : "Customer Not Created. Please Try Again";
    		System.out.println(TAG+message);
    	
    	} catch (Exception e) {
    		 System.out.println("Exception Occurred: "+e);
    	}
    }
/*
	public void updateParticipant(Participant participant) {
 	try {
    		
    		
    		
    		String sql = "update Customer set name = ?, phone= ?, email= ?, birthdate= ?, age= ?, inDateTime = ?, outDateTime = ?, temperature = ? where cid = ?";
    		
    		System.out.println("SQL is: "+sql);
    		
    		prepareStatement = connection.prepareStatement(sql);
    		prepareStatement.setString(1, participant.getName());
    		prepareStatement.setString(2, participant.getPhone());
    		prepareStatement.setString(3, participant.getEmail());

    		prepareStatement.setInt(9, customer.getCid());
    		
    		
    		//int result = prepareStatement.executeUpdate();
    		int result = prepareStatement.executeUpdate();
    		String message = result > 0 ? "Customer Updated Successfully" : "Customer Not Created. Please Try Again";
    		System.out.println(TAG+message);
    	
    	} catch (Exception e) {
    		 System.out.println("Exception Occurred: "+e);
    	}
		
	}

	public void deleteCustomer(int cid) {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void createParticipant(Participant participant) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void updateParticipant(Participant participant) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void deleteParticipant(int cid) {
		// TODO Auto-generated method stub
		
	}


}

*/
}
