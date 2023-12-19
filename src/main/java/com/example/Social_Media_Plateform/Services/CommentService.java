package com.example.Social_Media_Plateform.Services;

import com.example.Social_Media_Plateform.DataTransformer.commentTransformation;
import com.example.Social_Media_Plateform.Models.Comments;
import com.example.Social_Media_Plateform.Models.Posts;
import com.example.Social_Media_Plateform.Repository.PostRepository;
import com.example.Social_Media_Plateform.Repository.commentRepository;
import com.example.Social_Media_Plateform.RequestDtos.CommentRequestDto;
import com.example.Social_Media_Plateform.RequestDtos.PostRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.stream.events.Comment;
import java.util.Optional;

@Service
public class CommentService {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private commentRepository commentRepository;
    public String addComment(CommentRequestDto commentRequestDto) {

        Comments comment= commentTransformation.convertEntity(commentRequestDto);

        Optional<Posts> postsOptional = postRepository.findById(comment.getPostId());

        Posts posts = postsOptional.get();

        posts.getList().add(comment);

        commentRepository.save(comment);
        postRepository.save(posts);
        return comment.getText()+"";


    }
}
