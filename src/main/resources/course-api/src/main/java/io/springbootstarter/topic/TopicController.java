package io.springbootstarter.topic;

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
	
	@RequestMapping(method=RequestMethod.DELETE,path="/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT,path="/topics/{id}")
	public void updateTopic(@PathVariable String id,@RequestBody Topic topic) {
		topicService.updateTopic(id,topic);
	}
	
	@RequestMapping(method=RequestMethod.POST,path="/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	@RequestMapping("/topics/{foo}")
	public Topic getTopic(@PathVariable("foo") String id) {
		return topicService.getTopic(id);
	}
	
	@RequestMapping("/topics")
	public List<Topic> getTopics() {
		return topicService.getTopics();
	}

}
