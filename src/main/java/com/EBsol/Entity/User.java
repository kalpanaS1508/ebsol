package com.EBsol.Entity;

import com.EBsol.Entity.Enums.UserType;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;


@Data
@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @NotBlank(message = "please enter the name")
    @Column(name= "name" , nullable = false)
    public String name;


    @Column(name = "address")
    public String address;

    @Email(message = "Email is not valid", regexp ="^(?=.{1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@\"\n" +
            "                + \"[^-][A-Za-z0-9-]+(\\\\.[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$")
    @NotEmpty(message = "Email cannot be empty")
    @Column(name = "email")
    public String email;

    @Column(name = "user_type" )
    @Enumerated(EnumType.STRING)
    public UserType userType;

    @Column(name="skills")
    public String skills;

    @Column(name = "experience")
    public String experience;

    @Column(name="skypeId")
    public Integer skyeId;

    @Column(name="imageUrl")
    public String imageUrl;

    @Column(name="mobileNo")
    public Integer mobileNo;


    @Column(name="phoneNo")
    public Integer phoneNo;

    @Column(name="country")
    public String country;

    @Column(name="state")
    public String state;

    @Column(name = "city")
    public String city;

    @Column(name="pincode")
    public Integer pinCode;

    @Column(name="hobbies")
    public String hobbies;

    @Column(name = "interest")
    public String Interest;

    @Column(name="availableforWork")
    public String availableForWork;

//    @OneToOne(cascade = CascadeType.ALL,mappedBy = "user")
//    @ToString.Exclude
//    @EqualsAndHashCode.Exclude
//    public Candidate candidate;
//
//    @OneToOne(cascade = CascadeType.ALL,mappedBy = "user")
//    @ToString.Exclude
//    @EqualsAndHashCode.Exclude
//    public Vendor vendor;

}
