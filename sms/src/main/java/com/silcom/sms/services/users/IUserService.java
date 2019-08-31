package com.silcom.sms.services.users;

import com.silcom.sms.responses.UserResponse;

public interface IUserService {
    UserResponse getUserInfo(String user_key);
}
