package com.example.Social_Media_Plateform.Models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "like",collation ="{ 'locale': 'en' }")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class like {

    @Id
    private Integer id;
    private String likedByUserName;

    private String LikedOnUserName;
    private Integer postId;



}
