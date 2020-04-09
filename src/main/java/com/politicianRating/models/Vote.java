package com.politicianRating.models;

public class Vote {
	
	int developmentId;
	boolean upVote;
	boolean downVote;
	
	public int getDevelopmentId() {
		return developmentId;
	}
	public void setDevelopmentId(int developmentId) {
		this.developmentId = developmentId;
	}
	public boolean isUpVote() {
		return upVote;
	}
	public void setUpVote(boolean upVote) {
		this.upVote = upVote;
	}
	public boolean isDownVote() {
		return downVote;
	}
	public void setDownVote(boolean downVote) {
		this.downVote = downVote;
	}

	
}
