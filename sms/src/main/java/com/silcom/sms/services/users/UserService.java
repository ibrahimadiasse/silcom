package com.silcom.sms.services.users;

import com.silcom.sms.responses.UserResponse;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Override
    public UserResponse getUserInfo(final String user_key) {
        return new UserResponse("Cheikh Ahmet", "cheikh@silcom-corp.com");
    }
}
