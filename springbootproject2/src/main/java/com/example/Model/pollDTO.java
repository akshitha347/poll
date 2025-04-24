package com.example.Model;

import java.util.ArrayList;
import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="votingpoll")
public class pollDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
	
private String question;
	@ElementCollection
	private List<optionvoteDTO> options= new ArrayList<>();
//	@ElementCollection
//	private List<Long> votes=new ArrayList<>();
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<optionvoteDTO> getOptions() {
		return options;
	}
	public void setOptions(List<optionvoteDTO> options) {
		this.options = options;
	}
	
	
}
