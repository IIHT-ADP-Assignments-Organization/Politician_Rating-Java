package com.politicianRating.services;

import com.politicianRating.models.Candidate;
import com.politicianRating.models.Development;

public interface PoliticalPartyService {
	
	public Candidate addPoliticalLeader(Candidate candidate);
	public Candidate editPoliticalLeader(int candidateId);
	boolean deletePoliticalLeader(int candidateId);
	Candidate viewPoliticalLeader(int candidateId);
	public Development addDevelopmentActivity(Development development);
	public Development editDevelopmentActivity(int developmentId);
	boolean deleteDevelopmentActivity(int developmentId);
	Development viewDevelopmentActivity(int developmentId);

}
