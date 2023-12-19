package com.example.Social_Media_Plateform.RequestDtos;

import com.example.Social_Media_Plateform.Enum.AccountStatus;
import com.example.Social_Media_Plateform.Enum.Privacy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestDto {

    private Integer userId;
    private String username;
    private String email;
    private String password;
    private String bio;
    private  String profilePictureUrl;
    private Integer age;
//    private Integer likes;
    private AccountStatus accountStatus;
    private Privacy privacy;
//    private Integer noOfFriends;
}
