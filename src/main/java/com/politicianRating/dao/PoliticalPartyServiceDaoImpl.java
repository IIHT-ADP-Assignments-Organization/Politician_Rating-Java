package com.politicianRating.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.politicianRating.models.Candidate;
import com.politicianRating.models.Development;
@Component
@Service ("politicalPartyService")
public class PoliticalPartyServiceDaoImpl implements PoliticalPartyServiceDao {

	@Autowired
	@Transactional
	public Candidate addPoliticalLeader(Candidate candidate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Candidate editPoliticalLeader(int candidateId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public boolean deletePoliticalLeader(int candidateId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public Candidate viewPoliticalLeader(int candidateId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Development addDevelopmentActivity(Development development) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Development editDevelopmentActivity(int developmentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public boolean deleteDevelopmentActivity(int developmentId) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public Development viewDevelopmentActivity(int developmentId) {
		// TODO Auto-generated method stub
		return null;
	}

}
