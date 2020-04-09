package com.politicianRating.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.politicianRating.models.Candidate;
import com.politicianRating.models.Development;
import com.politicianRating.models.Party;
import com.politicianRating.models.User;
import com.politicianRating.models.Vote;
import com.politicianRating.services.AdminService;
import com.politicianRating.services.PoliticalPartyService;
import com.politicianRating.services.UserService;



public class TestFunctional {

	@Test
	public void createUser() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("politician-application.xml");
	
		
		User user = new User();
		user.setUserId(1);
		user.setUserName("john");
		user.setAddress("benglore");
		
		AdminService adminservice = (AdminService) context.getBean("adminService");
		User result = adminservice.createUser(user);
		assertNotNull(result);
		
						
	}

	@Test
	public void tesForAddPoliticalParty() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("politician-application.xml");
	
	Party party = new Party();
	party.setPartyId(2);
	party.setPartyName("Coconut");
	party.setPartyPic("https://coconut.jpeg");
	

	AdminService adminservice = (AdminService) context.getBean("adminService");
	Party result = adminservice.addPoliticalParty(party);
	assertNotNull(result);
	
}
	@Test
	public void tesForEditPoliticalParty() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("politician-application.xml");
	
	Party party = new Party();
	party.setPartyId(2);
	party.setPartyName("Coconut");
	party.setPartyPic("https://coconut.jpeg");
	

	AdminService adminservice = (AdminService) context.getBean("adminService");
	Party result = adminservice.editPoliticalParty(party);
	assertNotNull(result);
	
}
	@Test
	public void tesForDeletePoliticalParty() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("politician-application.xml");
	
	Party party = new Party();
	party.setPartyId(2);
	party.setPartyName("Coconut");
	party.setPartyPic("https://coconut.jpeg");
	

	AdminService adminservice = (AdminService) context.getBean("adminService");
	boolean result = adminservice.deletePoliticalParty(party.getPartyId());
    assertSame(2,result);
}
	@Test
	public void tesForViewPoliticalParty() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("politician-application.xml");
	
	Party party = new Party();
	party.setPartyId(2);
	party.setPartyName("Coconut");
	party.setPartyPic("https://coconut.jpeg");
	

	AdminService adminservice = (AdminService) context.getBean("adminService");
	Party result = adminservice.viewPoliticalParty(party.getPartyId(),party.getPartyName());
	assertNotNull(result);
	
}
	@Test
	public void tesForAddPoliticalLeader() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("politician-application.xml");
	
	Candidate candidate = new Candidate();
	candidate.setCandidateId(21);
	candidate.setCandidateName("anil");
	candidate.setCandidateState("Karnataka");
	

	PoliticalPartyService politicalpartyservice = (PoliticalPartyService) context.getBean("politicalpartyService");
	Candidate result = politicalpartyservice.addPoliticalLeader(candidate);
	assertNotNull(result);
	
}
	
	@Test
	public void tesForEditPoliticalLeader() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("politician-application.xml");
	
	Candidate candidate = new Candidate();
	candidate.setCandidateId(21);
	candidate.setCandidateName("anil");
	candidate.setCandidateState("Karnataka");
	

	PoliticalPartyService politicalpartyservice = (PoliticalPartyService) context.getBean("politicalpartyService");
	Candidate result = politicalpartyservice.editPoliticalLeader(candidate.getCandidateId());
	assertNotNull(result);
	
}
	@Test
	public void tesForViewPoliticalLeader() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("politician-application.xml");
	
	Candidate candidate = new Candidate();
	candidate.setCandidateId(21);
	candidate.setCandidateName("anil");
	candidate.setCandidateState("Karnataka");
	

	PoliticalPartyService politicalpartyservice = (PoliticalPartyService) context.getBean("politicalpartyService");
	Candidate result = politicalpartyservice.viewPoliticalLeader(candidate.getCandidateId());
	assertNotNull(result);
	
}
	
	@Test
	public void tesForDeletePoliticalLeader() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("politician-application.xml");
	
	Candidate candidate = new Candidate();
	candidate.setCandidateId(21);
	candidate.setCandidateName("anil");
	candidate.setCandidateState("Karnataka");
	

	PoliticalPartyService politicalpartyservice = (PoliticalPartyService) context.getBean("politicalpartyService");
	boolean result = politicalpartyservice.deletePoliticalLeader(candidate.getCandidateId());
	assertSame(21,result);
	
}
	@Test
	public void tesForAddDevelopmentActivity() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("politician-application.xml");
	
	Development development = new Development();
	development.setDevelopmentId(1);
	development.setCandidateId(1);
	development.setTitle("Road development");
	development.setActivity("closing patholes");
	development.setBudget(200000);
	development.setState("Karnata");
	development.setYear(2020);
	development.setMonth("March");
	

	PoliticalPartyService politicalpartyservice = (PoliticalPartyService) context.getBean("politicalpartyService");
	Development result = politicalpartyservice.addDevelopmentActivity(development);
	assertNotNull(result);
	
}
	@Test
	public void tesForEditDevelopmentActivity() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("politician-application.xml");
	
	Development development = new Development();
	development.setDevelopmentId(1);
	development.setCandidateId(1);
	development.setTitle("Road development");
	development.setActivity("closing patholes");
	development.setBudget(200000);
	development.setState("Karnata");
	development.setYear(2020);
	development.setMonth("March");
	

	PoliticalPartyService politicalpartyservice = (PoliticalPartyService) context.getBean("politicalpartyService");
	Development result = politicalpartyservice.editDevelopmentActivity(development.getDevelopmentId());
	assertNotNull(result);
	
}
	@Test
	public void tesForViewDevelopmentActivity() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("politician-application.xml");
	
	Development development = new Development();
	development.setDevelopmentId(1);
	development.setCandidateId(1);
	development.setTitle("Road development");
	development.setActivity("closing patholes");
	development.setBudget(200000);
	development.setState("Karnata");
	development.setYear(2020);
	development.setMonth("March");
	

	PoliticalPartyService politicalpartyservice = (PoliticalPartyService) context.getBean("politicalpartyService");
	Development result = politicalpartyservice.viewDevelopmentActivity(development.getDevelopmentId());
	assertNotNull(result);
	
}
	@Test
	public void tesForDeleteDevelopmentActivity() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("politician-application.xml");
	
	Development development = new Development();
	development.setDevelopmentId(1);
	development.setCandidateId(1);
	development.setTitle("Road development");
	development.setActivity("closing patholes");
	development.setBudget(200000);
	development.setState("Karnata");
	development.setYear(2020);
	development.setMonth("March");
	

	PoliticalPartyService politicalpartyservice = (PoliticalPartyService) context.getBean("politicalpartyService");
	boolean result = politicalpartyservice.deleteDevelopmentActivity(development.getDevelopmentId());
	assertSame(1,result);
	
}
	
	@Test
	public void tesForUpVote() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("politician-application.xml");
	
	Vote vote = new Vote();
	vote.setDevelopmentId(1);
	vote.setUpVote(true);
	vote.setDownVote(true);
	

	UserService userservice = (UserService) context.getBean("userService");
	boolean result = userservice.upVote(vote);
	assertSame(1,result);
	
}
	
	@Test
	public void tesForDownVote() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("politician-application.xml");
	
	Vote vote = new Vote();
	vote.setDevelopmentId(1);
	vote.setUpVote(true);
	vote.setDownVote(true);
	

	UserService userservice = (UserService) context.getBean("userService");
	boolean result = userservice.downVote(vote);
	assertSame(1,result);
	
}
	
}
