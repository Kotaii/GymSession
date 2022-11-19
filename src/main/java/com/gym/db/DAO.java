package com.gym.db;

import com.gym.model.Participant;

public interface DAO {

// We will declare methods for CRUD operations
	void createConnection();
	void closeConnection();
	
// Declare methods for Participant
	void createParticipant(Participant participant);
	void updateParticipant(Participant participant);
	void deleteParticipant(int bid);
	
}
