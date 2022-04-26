package com.EBsol.Controller;

import com.EBsol.Constant.ApiMessage;
import com.EBsol.Service.UserService;
import com.EBsol.Utils.ApiResponse;
import com.EBsol.request.UserReqDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "user")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {
    @Autowired
    public UserService userService;

    @RequestMapping(value = "/register",method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    public ResponseEntity registerUser(@RequestBody UserReqDTO userReqDto) throws JsonProcessingException {
        ApiResponse apiResponse = new ApiResponse(HttpStatus.OK,true,userService.register(userReqDto),ApiMessage.ApiMessage);
        return apiResponse.getResponse(apiResponse);
    }
}
