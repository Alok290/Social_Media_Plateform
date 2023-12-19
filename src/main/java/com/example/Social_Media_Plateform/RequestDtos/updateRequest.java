package com.example.Social_Media_Plateform.RequestDtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class updateRequest {
   private String oldPassword;
   private String newPassword;
}
