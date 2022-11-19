package com.gym.model;

public class Participant {

	public int pid;
	public String name;
	public String phone;
	public String email;
    public String bid;
	
	public Participant() {
		
	}
	
    public Participant(int pid, String name, String phone, String email, String bid) {
    	this.pid = pid;
    	this.name = name;
    	this.phone = phone;
    	this.email = email;
    	this.bid = bid;
    }
	
    public int getPid() {
       return pid; 
    }
    
    public void setPid(int pid) {
    	this.pid = pid;
    }
    
    public String getName() {
    	return name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}
	
	//String bid1= Integer.toString(bid);
}