package io.springbootstarter.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.springbootstarter.topic.Topic;

@Entity
public class Course {
	
	@Id
	private String id;
	private String name;
	private String description;
	@ManyToOne
	private Topic topic;

	public Course() {
		
	}
	
	public Course(String id, String name, String description,String topicId) {
		super();
		this.id = id;
		this.description=description;
		this.name=name;
		this.topic=new Topic(topicId,"","");
	}
	
	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
		
	@Override
	public String toString() {
		return "Course[id="+this.getId()+", Name="+this.getName()+", Description="+this.getDescription()+this.getTopic()+"]";
	}
}