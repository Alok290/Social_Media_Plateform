package com.example.Social_Media_Plateform.Models;

import com.example.Social_Media_Plateform.Enum.AccountStatus;
import com.example.Social_Media_Plateform.Enum.Privacy;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document (collection = "user", collation = "{ 'locale': 'en' }")

public class User {

    @Id
    private Integer userId;

    @Indexed(unique = true)
    private String name;

    @Indexed(unique = true)
    private String email;

    private String password;
    private String bio;
    private  String profilePictureUrl;
    private Integer age;
    private Integer likes;

    @Field("AccountStatus")
    private AccountStatus accountStatus;

    @Field("Privacy")
    private Privacy privacy;

    private Integer noOfFriends;

    private Admin admin;


    @DBRef
    List<Posts> postsList = new ArrayList<>();





}
