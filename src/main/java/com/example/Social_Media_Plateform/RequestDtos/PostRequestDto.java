package com.example.Social_Media_Plateform.RequestDtos;

import com.example.Social_Media_Plateform.Models.Posts;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostRequestDto {
    private Integer id;
    private String title;
    private String content;
    private String descriptions;
    private Integer likes;
    private String username;


}
