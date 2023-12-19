package com.example.Social_Media_Plateform.DataTransformer;

import com.example.Social_Media_Plateform.Models.User;
import com.example.Social_Media_Plateform.RequestDtos.UserRequestDto;

public class UserDataTransformations {

    public  static User convertEntity(UserRequestDto userRequestDto){

      User user = User.builder()
              .userId(userRequestDto.getUserId())
              .name(userRequestDto.getUsername())
              .email(userRequestDto.getEmail())
              .bio(userRequestDto.getBio())
              .age(userRequestDto.getAge())
              .password(userRequestDto.getPassword())
              .profilePictureUrl(userRequestDto.getProfilePictureUrl())
              .noOfFriends(0)
              .accountStatus(userRequestDto.getAccountStatus())
              .privacy(userRequestDto.getPrivacy())
              .likes(0)
              .build();

      return user;
    }
}
