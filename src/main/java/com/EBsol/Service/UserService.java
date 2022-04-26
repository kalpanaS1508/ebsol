package com.EBsol.Service;

import com.EBsol.Constant.ApiMessage;
import com.EBsol.Entity.User;
import com.EBsol.Exception.ResourceNotFoundException;
import com.EBsol.Repository.UserRepository;
import com.EBsol.request.UserReqDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
public class UserService {

 @Autowired
 UserRepository userRepository;

 public UserReqDTO register(UserReqDTO userReqDto){
  User user = new User();
  String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
          + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
  boolean emailValidation= Pattern.compile(regexPattern)
          .matcher(userReqDto.getEmail())
          .matches();
  System.out.println((emailValidation));

  try {
   user.setName(userReqDto.getName());
   user.setAddress(userReqDto.getAddress());
   user.setCity(userReqDto.getCity());
   user.setCountry(userReqDto.getCountry());

   if (emailValidation != true) {
    throw new ResourceNotFoundException(ApiMessage.Email);
   } else {
    user.setEmail(userReqDto.getEmail());
   }

   user.setHobbies(userReqDto.getHobbies());
   user.setInterest(userReqDto.getInterest());

   if (userReqDto.getPhoneNo()==null|| userReqDto.getPhoneNo() !=10) {
    throw new ResourceNotFoundException(ApiMessage.PhoneNumber);

   } else {
    user.setPhoneNo(userReqDto.getPhoneNo());
   }

   user.setMobileNo(userReqDto.getMobileNo());
   user.setSkills(userReqDto.getSkills());
   user.setAvailableForWork(userReqDto.getAvailableForWork());
   user.setImageUrl(user.getImageUrl());

   userRepository.save(user);
  }
  catch (ResourceNotFoundException e) {
   throw new ResourceNotFoundException(e.getMessage());
  }

  return userReqDto;
 }
 }


