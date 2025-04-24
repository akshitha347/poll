package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.Model.Vote;
import com.example.Model.pollDTO;

public interface pollservice {

	public pollDTO createpoll(pollDTO poll);
	public List<pollDTO> getallpolls();
	public Optional<pollDTO> getpollbyId(Long id) throws Exception;
    public void createvote(Long pollId, int optionIndex);
}
