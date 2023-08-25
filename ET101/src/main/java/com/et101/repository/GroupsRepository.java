package com.et101.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.et101.model.Groups;

@Repository
public interface GroupsRepository extends MongoRepository<Groups, Integer>{

}
