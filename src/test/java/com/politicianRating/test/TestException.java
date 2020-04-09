package com.politicianRating.test;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.politicalRating.common.FieldsCannotBeEmpty;
import com.politicianRating.models.Candidate;
import com.politicianRating.models.Party;
import com.politicianRating.models.User;
import com.politicianRating.services.AdminService;
import com.politicianRating.services.PoliticalPartyService;

import junit.framework.Assert;

public class TestException {
	
	@Test
    public void testForEmptyUserFields() throws FieldsCannotBeEmpty 
    {
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("politician-application.xml");
	 User user = new User();
		user.setUserId(1);
		user.setUserName("john");
		user.setAddress("benglore");
		AdminService adminservice = (AdminService) context.getBean("adminService");
		adminservice.createUser(user);
Assert.assertEquals(FieldsCannotBeEmpty.message," please fill the email");
    }

	@Test
    public void testForEmptyPoliticalPartyFields() throws FieldsCannotBeEmpty 
    {
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("politician-application.xml");
	 Party party = new Party();
		party.setPartyId(2);
		party.setPartyName("Coconut");
		party.setPartyPic("https://coconut.jpeg");
		
		AdminService adminservice = (AdminService) context.getBean("adminService");
		adminservice.addPoliticalParty(party);
Assert.assertEquals(FieldsCannotBeEmpty.message," please fill the email");
    }

	@Test
    public void testForEmptyCandidateFields() throws FieldsCannotBeEmpty 
    {
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("politician-application.xml");
	 Candidate candidate = new Candidate();
		candidate.setCandidateId(21);
		candidate.setCandidateName("anil");
		candidate.setCandidateState("Karnataka");
		

		PoliticalPartyService politicalpartyservice = (PoliticalPartyService) context.getBean("politicalpartyService");
		politicalpartyservice.addPoliticalLeader(candidate);
Assert.assertEquals(FieldsCannotBeEmpty.message," please fill the email");
    }

	
}
