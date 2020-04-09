package com.politicianRating.services;

import com.politicianRating.models.Vote;

public interface UserService {
	
	boolean upVote(Vote vote);
	boolean downVote(Vote vote);

}
