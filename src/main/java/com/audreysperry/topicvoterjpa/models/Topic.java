package com.audreysperry.topicvoterjpa.models;


import javax.persistence.*;

@Entity
@Table(name="topics")
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;

    @Column(name="topicdifficulty")
    private int topicDifficulty;


    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public int getTopicDifficulty() {
        return topicDifficulty;
    }

    public void setTopicDifficulty(int topicDifficulty) {
        this.topicDifficulty = topicDifficulty;
    }
}
