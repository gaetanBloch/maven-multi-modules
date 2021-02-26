package com.gbloch;

import com.gbloch.dto.UserDto;
import com.gbloch.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * <br>
 * Created on 26/02/2021
 *
 * @author gbloch
 * @version 1.0
 * @since 1.0
 */
@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDto userToUserDto(User user);

    User UserDtoToUser(UserDto userDto);
}
