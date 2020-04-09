package com.politicianRating.models;

public class Candidate {
	
	int candidateId;
	int partyId;
	String candidateName;
	String candidateState;
	long mobileNo;
	public int getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}
	public int getPartyId() {
		return partyId;
	}
	public void setPartyId(int partyId) {
		this.partyId = partyId;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public String getCandidateState() {
		return candidateState;
	}
	public void setCandidateState(String candidateState) {
		this.candidateState = candidateState;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
	
}
