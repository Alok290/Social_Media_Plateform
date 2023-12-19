package com.example.Social_Media_Plateform.DataTransformer;

import com.example.Social_Media_Plateform.Models.Posts;
import com.example.Social_Media_Plateform.RequestDtos.PostRequestDto;

public class PostDataTransformations {

    public static Posts convertEntity(PostRequestDto postRequestDto) {

        Posts post = Posts.builder()
                .content(postRequestDto.getContent())
                .id(postRequestDto.getId())
                .descriptions(postRequestDto.getDescriptions())
                .title(postRequestDto.getTitle())
                .username(postRequestDto.getUsername())
                .likes(0)
                .build();

        return post;
    }
}
