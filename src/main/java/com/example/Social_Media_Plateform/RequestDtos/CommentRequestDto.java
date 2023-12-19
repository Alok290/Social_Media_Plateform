package com.example.Social_Media_Plateform.RequestDtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentRequestDto {
    private Integer id;
    private String commentBy; //username
    private String commentOn; //username and post
    private Integer postId;
    private String text;
}
