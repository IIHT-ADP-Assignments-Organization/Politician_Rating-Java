package com.politicianRating.services;

import com.politicianRating.models.Party;
import com.politicianRating.models.User;

public interface AdminService {
	
	public User createUser(User user);
	public Party addPoliticalParty(Party party);
	public Party editPoliticalParty(Party party);
	boolean deletePoliticalParty(int partyId);
	public Party viewPoliticalParty(int partyId,String partyName); 
	
}
