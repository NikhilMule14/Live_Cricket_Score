package com.crick.apis.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crick.apis.entity.Match;
import com.crick.apis.service.MatchService;

@RestController
@RequestMapping("/match")
@CrossOrigin("*")
public class MatchController {

	private MatchService matchService;

	public MatchController(MatchService matchService) {
		 
		this.matchService = matchService;
	}
	
	@GetMapping("/live")
	public ResponseEntity<List<Match>> getLiveMaches(){
		return new ResponseEntity<>(this.matchService.getLiveMaches(),HttpStatus.OK);
	}
	
	//get All Matches 
	@GetMapping
	public ResponseEntity<List<Match>> getAllMatches(){
		return new ResponseEntity<>(this.matchService.getAllMatches(),HttpStatus.OK);
	}
	
	//get point table
	@GetMapping("/point-table")
	public ResponseEntity<?> getPointTable(){
		return new ResponseEntity<>(this.matchService.getPointTable(),HttpStatus.OK);
	}
	
	
}
