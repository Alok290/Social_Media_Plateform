package com.example.Social_Media_Plateform.DataTransformer;

import com.example.Social_Media_Plateform.Models.Admin;
import com.example.Social_Media_Plateform.RequestDtos.AdminRequestDto;

public class AdminDataTransformations {

    public static Admin convertEntity(AdminRequestDto adminRequestDto){

        Admin admin=Admin.builder()
                .id(adminRequestDto.getId())
                .email(adminRequestDto.getEmail())
                .name(adminRequestDto.getName())
                .password(adminRequestDto.getPassword())
                .build();

        return admin;
    }
}
