package com.EBsol.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.usertype.UserType;

import javax.validation.constraints.NotBlank;

@Data
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserReqDTO {

    @NotBlank(message = "please enter the name")
    public String name;

    @NotBlank(message = "please enter the address")
    public String address;

    public String email;

    public UserType userType;

    public String skills;

    public String experience;

    public Integer skyeId;

    public String imageUrl;

    public Integer mobileNo;

    public Integer phoneNo;

    public String country;

    public String state;

    public String city;

    public Integer pinCode;

    public String hobbies;

    public String Interest;

    public String availableForWork;

}
