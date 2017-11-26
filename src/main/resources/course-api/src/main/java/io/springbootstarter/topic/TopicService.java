package io.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics=new ArrayList<>(Arrays.asList(
			new Topic("java","Java 8","Java is oops and functional programming languagge"),		
			new Topic("java-script","Javascript ","Java scripting is scripting languagge"),	
			new Topic("php","PHP 5","PHP is scripting and functional programming languagge"),	
			new Topic("dotnet",". NET","dot net is oops and functional programming languagge")
	));

	public List<Topic> getTopics() {
		return topics;
	}

	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}

	public Topic getTopic(String id) {
		return topics.stream()
		      .filter(p -> p.getId().equals(id))
		      .findFirst().get();
	}

	public void addTopic(Topic topic) {
         topics.add(topic);		
	}

	public void updateTopic(String id, Topic topic) {
		for(int i=0;i<topics.size();i++) {
			Topic t=topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
			}
		}
	}

	public void deleteTopic(String id) {
		topics.removeIf(p -> p.getId().equals(id));
	}
	
}