package ua.vholovetskyi.splitup.users.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;

@Getter
@AllArgsConstructor
public class UserDto {

    private String username;

    private String email;

    private String password;

    private Instant createdAt;
}
