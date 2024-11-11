package ua.vholovetskyi.splitup.users.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.vholovetskyi.splitup.commons.response.Error;
import ua.vholovetskyi.splitup.users.db.UserRepository;
import ua.vholovetskyi.splitup.users.mapper.UserFactory;
import ua.vholovetskyi.splitup.users.web.dto.UserDto;
import ua.vholovetskyi.splitup.users.web.dto.UserResponse;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public UserResponse createUser(UserDto userDto) {
        if (userRepository.existsByUsername(userDto.getUsername())) {
            return UserResponse.onFailure(Error.CONFLICT);
        }

        var saved = userRepository.save(UserFactory.createNewUser(userDto));
        return UserResponse.onSuccess(saved.getId());
    }
}
