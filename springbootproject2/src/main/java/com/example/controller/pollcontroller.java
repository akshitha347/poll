package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.Vote;
import com.example.Model.pollDTO;
import com.example.service.pollservice;
import com.example.service.pollserviceImpl;

@RestController
@RequestMapping(value="/api")
public class pollcontroller {
	@Autowired
pollserviceImpl pollsevice;
	@PostMapping(value="/poll")
	public ResponseEntity<String> createpoll(@RequestBody pollDTO poll) {
		 pollsevice.createpoll(poll);
		 return new ResponseEntity<String>("CREATED",HttpStatus.CREATED);
	}
	@GetMapping(value="/poll")
	public List<pollDTO> getallpolls(){
		return pollsevice.getallpolls();
	}
	@GetMapping(value="/polls")
	public Optional<pollDTO> getpollbyid(@RequestParam(value="id") Long id) throws Exception{
		return pollsevice.getpollbyId(id);
				//.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}
	@PostMapping(value="/vote")
	public ResponseEntity<String> createvote(@RequestBody Vote vote){
		System.out.println(vote.getPollid());
		 pollsevice.createvote(vote.getPollid(), vote.getOptionIndex());
		 return new ResponseEntity<String>("CREATED",HttpStatus.CREATED);
	}
}
