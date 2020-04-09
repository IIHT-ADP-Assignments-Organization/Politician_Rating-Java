package com.politicianRating.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.airTicket.models.Customer;
import com.politicianRating.models.Candidate;
import com.politicianRating.models.User;



public class TestBoundary {
	
	@Test
    public void testAddressLength()
    {
		User user = new User();
		user.setUserId(1);
		user.setUserName("john");
		user.setAddress("benglore");
        		
		int minChar=100;
        boolean addressLength=(user.getAddress().length()<=minChar);
        assertEquals( addressLength,user.getAddress());

    }

	 @Test
	    public void testPhoneNumberLength()
	    {
		 Candidate candidate = new Candidate();
			candidate.setCandidateId(21);
			candidate.setCandidateName("anil");
			candidate.setCandidateState("Karnataka");
			candidate.setMobileNo(1234567891);
	        long contactNumberLength=10;
	        
	    assertEquals( contactNumberLength,candidate.getMobileNo());


	    }

	
}
