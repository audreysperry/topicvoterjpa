package com.audreysperry.topicvoterjpa.dao;

import com.audreysperry.topicvoterjpa.models.Topic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicDao extends CrudRepository<Topic, Long>{
}
