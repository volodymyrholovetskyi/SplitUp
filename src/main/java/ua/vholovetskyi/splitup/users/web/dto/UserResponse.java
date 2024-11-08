package ua.vholovetskyi.splitup.users.web.dto;

import ua.vholovetskyi.splitup.commons.dto.ApiResponse;
import ua.vholovetskyi.splitup.commons.dto.Error;

public class UserResponse extends ApiResponse<Long, Error> {

    public UserResponse(Long id, Error error, boolean success) {
        super(id, error, success);
    }

    public static UserResponse onSuccess(Long id) {
        return new UserResponse(id, null, true);
    }

    public static UserResponse onFailure(Error error) {
        return new UserResponse(null, error, false);
    }
}
