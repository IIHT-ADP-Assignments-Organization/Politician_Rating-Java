package com.politicianRating.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.politicianRating.dao.UserServiceDao;
import com.politicianRating.models.Vote;
@Component
@Service ("userService")
public class UserServiceImpl implements UserService {

	
	@Autowired
	UserServiceDao userServiceDao;
	@Transactional
	public boolean upVote(Vote vote) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean downVote(Vote vote) {
		// TODO Auto-generated method stub
		return false;
	}

}
