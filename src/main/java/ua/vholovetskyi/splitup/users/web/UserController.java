package ua.vholovetskyi.splitup.users.web;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.vholovetskyi.splitup.users.service.UserService;
import ua.vholovetskyi.splitup.users.web.dto.UserDto;

@RestController
@RequiredArgsConstructor
@RequestMapping("users")
public class UserController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<?> hello() {
        return null;
    }

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody UserDto userDto) {
        return userService.createUser(userDto)
                .handle(
                        userId -> ResponseEntity.status(HttpStatus.CREATED).body(userId),
                        error -> new ResponseEntity<>(error, HttpStatus.BAD_REQUEST)
                );
    }
}
