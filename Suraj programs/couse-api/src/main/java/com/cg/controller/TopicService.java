package com.cg.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	
	private List <Topic> topics=Arrays.asList(
			new Topic("Spring","Spring Framework","Spring Framework Discreption"),
			new Topic ("Core Java","Inheritance","Corejava Discreption"),
			new Topic("Spring MVC","Spring MVC","Spring MVC Discreption")
			);
	
	
	public List<Topic> getAllTopics(){
		return topics;
	}

}
