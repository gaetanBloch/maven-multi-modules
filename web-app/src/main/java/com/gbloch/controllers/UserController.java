package com.gbloch.controllers;

import com.gbloch.UserMapper;
import com.gbloch.dto.UserDto;
import com.gbloch.entities.User;

/**
 * <br>
 * Created on 26/02/2021
 *
 * @author gbloch
 * @version 1.0
 * @since 1.0
 */
public class UserController {
    User saveUser(UserDto userDto) {
        return UserMapper.INSTANCE.UserDtoToUser(userDto);
    }
}

