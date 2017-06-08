package com.gurkhatech.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topicList = new ArrayList<>(
			
			Arrays.asList(new Topic("1", "Mesh", "ramro din"),
			new Topic("2", "Brish", "abishmarinaya din"),
			new Topic("3", "Mithun", "Din ramro tara rat thikai matra hunechha"),
			new Topic("4", "Karkat", "aaja masu vat khana paune yog chha")));

	public List<Topic> getAllTopics (){
		return topicList;
	}
	public Topic getTopic(String topic){
		return topicList.stream().filter(t->t.getId().equals(topic)).findFirst().get();
	}
	public Topic getTopicByName(String name){
		return topicList.stream().filter(t->t.getName().equals(name)).findFirst().get();
	}

	public void updateTopic(String id,Topic newTopic){
		for(int topicCounter =0; topicCounter<topicList.size();topicCounter++){
			if(topicList.get(topicCounter).getId().equals(id)){
				topicList.set(topicCounter, newTopic);
			}
		}
	}
	public void addTopic(Topic topic){
		topicList.add(topic);
	}
	public void delteTopic(String id) {
		topicList.removeIf(t->t.getId().equals(id));
	}
}
