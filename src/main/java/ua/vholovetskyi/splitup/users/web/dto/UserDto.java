package ua.vholovetskyi.splitup.users.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserDto {

    private String username;
    private String password;
}
