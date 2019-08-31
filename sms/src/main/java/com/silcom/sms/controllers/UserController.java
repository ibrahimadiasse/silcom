package com.silcom.sms.controllers;

import com.silcom.sms.responses.UserResponse;
import com.silcom.sms.services.users.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Validated
@RestController
@RequestMapping(value = "/api/v1.0.0/users", produces = "application/json")
public class UserController {

    @Autowired private IUserService userService;

    @GetMapping(value = "/{user_key}")
    public UserResponse getUserInfo(@Valid @NotNull @PathVariable("user_key") String user_key) {
        return userService.getUserInfo(user_key);
    }
}
