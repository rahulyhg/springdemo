package com.gurkhatech.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	@RequestMapping("rashifal/daily")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}
	
	@RequestMapping("rashifal/daily/{topic}")
	public Topic getTopic(@PathVariable String topic){
		return topicService.getTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="rashifal/daily")
	public void postTopic(@RequestBody Topic topic){
		topicService.addTopic(topic);
		System.out.println("Came here" + topic.getName());
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="rashifal/daily/{id}")
	public void putTopic(@RequestBody Topic topic,@PathVariable("id") String id){
		topicService.updateTopic(id, topic);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="rashifal/daily/{id}")
	public void deleteTopic(@PathVariable("id") String id){
		topicService.delteTopic(id);
	}	
	@RequestMapping("rashifal/daily/rashiname/{name}")
	public Topic getTopicByName(@PathVariable("name") String topic){
		return topicService.getTopicByName(topic);
	}
	
	}
