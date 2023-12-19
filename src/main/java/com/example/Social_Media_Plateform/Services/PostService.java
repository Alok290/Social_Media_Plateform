package com.example.Social_Media_Plateform.Services;

import com.example.Social_Media_Plateform.DataTransformer.PostDataTransformations;
import com.example.Social_Media_Plateform.Models.Posts;
import com.example.Social_Media_Plateform.Models.User;
import com.example.Social_Media_Plateform.Repository.PostRepository;
import com.example.Social_Media_Plateform.Repository.UserRepository;
import com.example.Social_Media_Plateform.RequestDtos.PostRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;
    public String createNewPost(PostRequestDto postRequestDto) {

        Posts posts = PostDataTransformations.convertEntity(postRequestDto);

        User user = userRepository.findUserByname(posts.getUsername()).get();


        user.getPostsList().add(posts);

        postRepository.save(posts);

        userRepository.save(user);

        return "Your Post is created and Your Post id is"+posts.getId();


    }
}
