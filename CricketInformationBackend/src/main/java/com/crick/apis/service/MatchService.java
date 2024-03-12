package com.crick.apis.service;

import java.util.List;
import java.util.Map;

import com.crick.apis.entity.Match;

public interface MatchService {

	//get all matches
	List<Match> getAllMatches();
	
	//get live matches
	 List<Match> getLiveMaches();
	 
	//get cwc 2023 matches
	 
	 List<List<String>> getPointTable();
	 
	
	
}
