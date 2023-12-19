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
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document (collection = "Admin", collation = "{ 'locale': 'en' }")
public class Admin {

    @Id
    private Integer id;
    private String name;
    private String email;
    private String password;

    @DBRef
    List<User> list = new ArrayList<>();

}
