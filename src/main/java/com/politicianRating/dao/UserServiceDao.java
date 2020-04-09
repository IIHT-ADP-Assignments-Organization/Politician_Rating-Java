package com.politicianRating.dao;

import com.politicianRating.models.Vote;

public interface UserServiceDao {
	
	boolean upVote(Vote vote);
	boolean downVote(Vote vote);

}
