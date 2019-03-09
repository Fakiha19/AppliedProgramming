package com.example.demo.topic;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics= new ArrayList<>(Arrays.asList(
				new Topic("spring","Spring Framework","Ap Course"),
				new Topic("angular","Angular Framework","Ap Course"),
				new Topic("node","Javascript Framework","Javascript Course"),
				new Topic("python","Django Framework","ML Course"),
				new Topic("C#",".Net Framework","DP")
				));
	
	public List<Topic> getAllTopics()
	{
		return topics;
	}
	
	public Topic getTopic(String id) 
	{
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
		
	}

	public void deleteTopic(String id) {
		for(int i=0; i<topics.size();i++) 
		{
		Topic t=topics.get(i);
		if(t.getId().equals(id)) 
		{
			topics.remove(i);
			return;
		}	
		}
	}

	public void updateTopic(Topic topic, String id) {
		for(int i=0; i<topics.size();i++) 
		{
		Topic t=topics.get(i);
		if(t.getId().equals(id)) 
		{
			topics.set(i, topic);
			return;
		}
		}
		
	}
	
}
