package ua.vholovetskyi.splitup.users.mapper;

import ua.vholovetskyi.splitup.users.model.User;
import ua.vholovetskyi.splitup.users.web.dto.UserDto;

import java.time.Instant;

public class UserFactory {

    public static User createNewUser(UserDto userDto) {
        return new User(userDto.getUsername(), userDto.getPassword(), Instant.now());
    }
}
