package com.gym.model;

public class Batch {

	
	int bid;
	String timeSession;
    
	public Batch() {
	
     }

	public Batch(int bid, String timeSession) {
      this.bid = bid;
      this.timeSession = timeSession;
	
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getTimeSession() {
		return timeSession;
	}

	public void setTimeSession(String timeSession) {
		this.timeSession = timeSession;
	}
   
    

}