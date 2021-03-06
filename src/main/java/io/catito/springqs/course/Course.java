package io.catito.springqs.course;

import io.catito.springqs.topic.Topic;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity(name="Course")
public class Course {

    @Id
    @Column(name="courseId")
    private String id;
    private String name;
    private String description;
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Topic topic;

    public Course() {

    }

    public Course(String id, String name, String description, String topicID) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic = new Topic(topicID, "","");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

}
