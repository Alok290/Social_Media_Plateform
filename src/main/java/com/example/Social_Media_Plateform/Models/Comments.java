package com.example.Social_Media_Plateform.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "comments", collation = "{ 'locale': 'en' }")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Comments {

    private Integer id;
    private String commentBy; //username
    private String commentOn; //username and post
    private Integer postId;
    private String text;
    private Posts posts;


}
