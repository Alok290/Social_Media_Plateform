package com.example.Social_Media_Plateform.Models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document (collection = "posts",collation = "{ 'locale': 'en' }")
public class Posts {

    @Id
    private Integer id;
    private String title;
    private String content;
    private String descriptions;
    private Integer likes;
    private String username;
    private  User user;
    @DBRef
    List<Comments> list = new ArrayList<>();


}

