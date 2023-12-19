package com.example.Social_Media_Plateform.Services;

import com.example.Social_Media_Plateform.DataTransformer.AdminDataTransformations;
import com.example.Social_Media_Plateform.Models.Admin;
import com.example.Social_Media_Plateform.Repository.AdminRepository;
import com.example.Social_Media_Plateform.RequestDtos.AdminRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {


    @Autowired
    private AdminRepository adminRepository;
    public String addAdmin(AdminRequestDto adminRequestDto) {

        Admin admin = AdminDataTransformations.convertEntity(adminRequestDto);
        adminRepository.save(admin);
        return "Successfully saved in db";
    }
}
