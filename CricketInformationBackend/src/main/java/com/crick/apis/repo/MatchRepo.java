package com.crick.apis.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crick.apis.entity.Match;

public interface MatchRepo extends JpaRepository<Match, Integer> {

	//match feach karana 
	//providing team name 
	
	Optional<Match> findByTeamHeading(String teamHeading);
	
}
