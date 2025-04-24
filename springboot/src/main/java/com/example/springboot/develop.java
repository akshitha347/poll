package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component


public class develop {
	
	@Autowired
	@Qualifier("laptop")

	private computer c;
	
	
void compile() {
	c.mode();
	System.out.println("developer class");
}
}
