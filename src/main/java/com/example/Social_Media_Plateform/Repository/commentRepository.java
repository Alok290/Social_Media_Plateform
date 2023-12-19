package com.example.Social_Media_Plateform.Repository;

import com.example.Social_Media_Plateform.Models.Comments;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface commentRepository extends MongoRepository<Comments,Integer> {
}
