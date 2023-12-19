package com.example.Social_Media_Plateform.Controllers;

import com.example.Social_Media_Plateform.Models.Admin;
import com.example.Social_Media_Plateform.Repository.AdminRepository;
import com.example.Social_Media_Plateform.RequestDtos.AdminRequestDto;
import com.example.Social_Media_Plateform.Services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Admin")
public class AdminController {

    @Autowired
    private AdminService adminService;
    @PostMapping("add-Admin")

    public String add(@RequestBody AdminRequestDto adminRequestDto){



        String result = adminService.addAdmin(adminRequestDto);

        return result;
    }




}
