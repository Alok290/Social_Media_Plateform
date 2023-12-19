package com.example.Social_Media_Plateform.Controllers;


import com.example.Social_Media_Plateform.RequestDtos.CommentRequestDto;
import com.example.Social_Media_Plateform.Services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping("addComment")
    public String addComment(@RequestBody CommentRequestDto commentRequestDto){

        String result= commentService.addComment(commentRequestDto);
        return result;

    }

}
