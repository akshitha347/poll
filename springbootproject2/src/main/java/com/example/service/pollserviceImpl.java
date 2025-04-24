package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Exception.PollIdException;
import com.example.Model.optionvoteDTO;
import com.example.Model.pollDTO;
import com.example.Repository.pollRepository;
@Service
public class pollserviceImpl implements pollservice{
	@Autowired
pollRepository pollrepo;
	@Override
	public pollDTO createpoll(pollDTO poll) {
		// TODO Auto-generated method stub
		return pollrepo.save(poll);
	}

	@Override
	public List<pollDTO> getallpolls() {
		// TODO Auto-generated method stub
		return pollrepo.findAll();
	}

	@Override
	public Optional<pollDTO> getpollbyId(Long id) throws PollIdException {
		// TODO Auto-generated method stub
		Optional<pollDTO>p= pollrepo.findById(id);
		if(p.isEmpty()) {
			throw new PollIdException("poll with the given id is not found","501");
		}
		
			return p;
	
	}

	@Override
	public void createvote(Long pollId, int optionIndex) {
		// TODO Auto-generated method stub
		if (pollId == null) {
	        throw new IllegalArgumentException("The given ID must not be null");
	    }

	    pollDTO p = pollrepo.findById(pollId).orElseThrow(() -> new PollIdException("Poll ID not found", "501"));
	    List<optionvoteDTO> opt=  p.getOptions();
       if(optionIndex<0||optionIndex>=opt.size()) {
    	   throw new IllegalArgumentException("Invalid option index");
       }
     optionvoteDTO selectedoption=opt.get(optionIndex);
     selectedoption.setVotecount(selectedoption.getVotecount()+1);
     pollrepo.save(p);
	}

}
