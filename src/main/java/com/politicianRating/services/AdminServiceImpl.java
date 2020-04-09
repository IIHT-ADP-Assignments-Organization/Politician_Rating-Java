package com.politicianRating.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.politicianRating.dao.AdminServiceDao;
import com.politicianRating.models.Party;
import com.politicianRating.models.User;

@Component
@Service ("adminService")
public class AdminServiceImpl implements AdminService {

	
	@Autowired
	AdminServiceDao adminServiceDao;
	@Transactional
	public User createUser(User user) {
		return user;
		// TODO Auto-generated method stub

	}

	@Transactional
	public Party addPoliticalParty(Party party) {
		return party;
		// TODO Auto-generated method stub

	}

	@Transactional
	public Party editPoliticalParty(Party party) {
		return party;
		// TODO Auto-generated method stub

	}

	@Transactional
	public boolean deletePoliticalParty(int partyId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public Party viewPoliticalParty(int partyId, String partyName) {
		return null;
		// TODO Auto-generated method stub

	}

}
