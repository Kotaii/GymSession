package com.gym.customer;

import java.util.Scanner;

import com.gym.db.DB;
import com.gym.model.Participant;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Gym Management Systems" );
        
        
        System.out.println("Connecting to Gym DB....");
        DB db =new DB();
        db.createConnection();
       
    	
        Participant participant = new Participant();
    	
    	//participant.setCid(4);
    	participant.setName("Ron");
    	participant.setPhone("623-349-8830");
    	participant.setEmail("Wane@gmail.com");
          
    	
    	//Scanner scanner = new Scanner(System.in);
    	//System.out.println("Enter Name: ");
    	//String name = scanner.nextLine();
    	
    	
    	//System.out.println("Enter Password: ");
    	//String password = scanner.nextLine();
    	
    	//scanner.close();
    	
    	
    	
		db.createParticipant(participant);
    	//db.updateCustomer(customer);
    	//db.deleteParticipant(2);
    	//db.executeProcedure(name, password);
		 db.closeConnection(); 
    }
    
}