package com.portal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.portal.entity.Match;
import com.portal.entity.User;
import com.portal.repo.MatchRepository;

@Repository
public class MatchServiceImpl implements MatchService {

	@Autowired
	private MatchRepository matchRepo;

	@Override
	public void saveMatchData(Match match) {
		
		matchRepo.save(match);
	}

	@Override
	public List<Match> getAllMatch(User users) {
		return matchRepo.getAllMatchs(users);
	}

}
