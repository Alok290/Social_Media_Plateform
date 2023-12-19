package com.example.Social_Media_Plateform.Repository;

import com.example.Social_Media_Plateform.Models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User,Integer> {
      Optional<User> findUserByname(String name);
      Optional<User> findUserByEmail(String email);
}
