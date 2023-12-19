package com.example.Social_Media_Plateform.Services;


import com.example.Social_Media_Plateform.DataTransformer.UserDataTransformations;
import com.example.Social_Media_Plateform.Exceptions.EmailAlreadyPresent;
import com.example.Social_Media_Plateform.Exceptions.UserNameAlreadyPresent;
import com.example.Social_Media_Plateform.Exceptions.passwordIsNotValid;
import com.example.Social_Media_Plateform.Exceptions.userNotPresent;
import com.example.Social_Media_Plateform.Models.Admin;
import com.example.Social_Media_Plateform.Models.User;
import com.example.Social_Media_Plateform.Repository.AdminRepository;
import com.example.Social_Media_Plateform.Repository.UserRepository;
import com.example.Social_Media_Plateform.RequestDtos.UserRequestDto;
import com.example.Social_Media_Plateform.RequestDtos.likedRequestDto;
import com.example.Social_Media_Plateform.RequestDtos.updateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AdminRepository adminRepository;



    public String createUser(UserRequestDto userRequestDto) throws Exception{

//      converting data in user entity from userRequest dtos
        User user = UserDataTransformations.convertEntity(userRequestDto);



//        Optional<User>  optionalUser= userRepository.findUserByname(user.getName());

        Optional<User> optionalUser = userRepository.findById(user.getUserId());

//        validating userName is unique
        if(optionalUser.isPresent() && optionalUser.get().getName().equals(user.getName())){
            throw new UserNameAlreadyPresent("This userName is Already exist");
        }


        Optional<User> optionalUser1 =userRepository.findUserByEmail(user.getEmail());

//        validating Email Address
        if(optionalUser1.isPresent()){
            throw new EmailAlreadyPresent("This Email is Already exist");
        }


        List<Admin> allAdmins = adminRepository.findAll();

        // Add the user to each admin's list of users here i am using more than one Admin
        for (Admin admin : allAdmins) {
            admin.getList().add(user);
            adminRepository.save(admin);
        }

//        saving into dataBase
        userRepository.save(user);

        return "Successfully stored in DB";
    }

    public String updatePassword(updateRequest updaterequest, String username) throws Exception {

        Optional<User> optionalUser = userRepository.findUserByname(username);


        //validating user is present or not
        if (!optionalUser.isPresent()){
            throw new userNotPresent("this username is not valid");
        }
        User user = optionalUser.get();

        //checking old password is correct or not
        if(!user.getPassword().equals(updaterequest.getOldPassword())){
            throw new passwordIsNotValid("this old password does not match");
        }

        //updating password
        user.setPassword(updaterequest.getNewPassword());

//        saving in database
        userRepository.save(user);

        return "password is successfully changed";
    }

    public String updateProfilePic(String profilePicUrl, String username) throws Exception{
        Optional<User> optionalUser = userRepository.findUserByname(username);

//        validating user
        if(!optionalUser.isPresent()){
            throw new userNotPresent("This user name is not valid");
        }

        User user = optionalUser.get();

//        updating profile pic link
        user.setProfilePictureUrl(profilePicUrl);

//        saving in Db
        userRepository.save(user);
        return "Congrats !! your profile picture is successfully changed";

    }

    public String updateBio(String bio, String username) throws Exception{
        Optional<User> optionalUser = userRepository.findUserByname(username);

//        validating user
        if(!optionalUser.isPresent()){
            throw new userNotPresent("This user name is not valid");
        }

        User user = optionalUser.get();

//        updating bio
        user.setProfilePictureUrl(bio);

//        saving in Db
        userRepository.save(user);
        return "Congrats !! your profile picture is successfully changed";

    }

    public void like(likedRequestDto likedRequestDto) {
//        finduserLekrd by is your in freindlis

//        then update like by +1


    }
}
