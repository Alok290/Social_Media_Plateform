package com.example.Social_Media_Plateform.DataTransformer;

import com.example.Social_Media_Plateform.Models.Comments;
import com.example.Social_Media_Plateform.RequestDtos.CommentRequestDto;



public class commentTransformation {


    public static Comments convertEntity(CommentRequestDto commentRequestDto) {

        Comments comments = Comments.builder()
                .commentBy(commentRequestDto.getCommentBy())
                .commentOn(commentRequestDto.getCommentOn())
                .id(commentRequestDto.getId())
                .postId(commentRequestDto.getPostId())
                .text(commentRequestDto.getText())
                .build();
        return comments;
    }
}
