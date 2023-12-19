package com.example.Social_Media_Plateform.Repository;

import com.example.Social_Media_Plateform.Models.Admin;
import com.example.Social_Media_Plateform.Services.UserService;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends MongoRepository<Admin,Integer> {

}
