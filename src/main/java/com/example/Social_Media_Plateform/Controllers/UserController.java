package com.example.Social_Media_Plateform.Controllers;

import com.example.Social_Media_Plateform.Models.User;
import com.example.Social_Media_Plateform.RequestDtos.UserRequestDto;
import com.example.Social_Media_Plateform.RequestDtos.likedRequestDto;
import com.example.Social_Media_Plateform.RequestDtos.updateRequest;
import com.example.Social_Media_Plateform.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add-user")
    public String addUSer(@RequestBody UserRequestDto userRequestDto){
        try{
            String result = userService.createUser(userRequestDto);
            return result;
        }
        catch (Exception e){
            return e.getMessage();
        }
    }
    @PutMapping("/updatePassword")
    public ResponseEntity ChangePassword(@RequestBody updateRequest updaterequest,@RequestParam  String username) throws Exception{

        try{

            String result = userService.updatePassword(updaterequest, username);
            return new ResponseEntity<>(result, HttpStatus.ACCEPTED);
        }
        catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/updateProfilePic")
    public ResponseEntity updateProfilePic(@RequestParam String ProfilePicUrl , @RequestParam String username) throws Exception {


        try {
            String result = userService.updateProfilePic(ProfilePicUrl, username);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }

    }

    @PutMapping("/updateBio")
    public ResponseEntity updateBio(@RequestParam String bio , @RequestParam String username) throws Exception{


        try{
            String result = userService.updateProfilePic(bio,username);
            return new ResponseEntity<>(result,HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }


    }




    @PutMapping("/Like")
    public ResponseEntity like(@RequestBody likedRequestDto likedRequestDto){

        userService.like(likedRequestDto);
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }




}
