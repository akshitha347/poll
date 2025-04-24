package com.example.Model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Embeddable
public class optionvoteDTO {
private String options;
private Long votecount=0L;
public String getOption() {
	return options;
}
public void setOption(String options) {
	this.options = options;
}
public Long getVotecount() {
	return votecount;
}
public void setVotecount(Long votecount) {
	this.votecount = votecount;
}
public optionvoteDTO(String options, Long votecount) {
	super();
	this.options = options;
	this.votecount = votecount;
}
public optionvoteDTO() {
	
}
}
