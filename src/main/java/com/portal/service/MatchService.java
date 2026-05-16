package com.portal.service;

import java.util.List;

import com.portal.entity.Match;
import com.portal.entity.User;

public interface MatchService {

	public void saveMatchData(Match match);

	public List<Match> getAllMatch(User users);

}
