package com.example.Social_Media_Plateform.Controllers;


import com.example.Social_Media_Plateform.RequestDtos.PostRequestDto;
import com.example.Social_Media_Plateform.Services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Post")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping("addNewPost")
    public String createPost(@RequestBody PostRequestDto postRequestDto){

        String Result= postService.createNewPost(postRequestDto);

        return Result;
    }

}
