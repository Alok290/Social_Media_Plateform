package com.example.Social_Media_Plateform.Repository;

import com.example.Social_Media_Plateform.Models.Posts;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Posts,Integer> {
}
