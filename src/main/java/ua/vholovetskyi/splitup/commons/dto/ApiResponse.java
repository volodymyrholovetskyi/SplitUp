package ua.vholovetskyi.splitup.commons.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.function.Function;

@Getter
@AllArgsConstructor
public class ApiResponse<BODY, ERROR> {

    private BODY body;
    private ERROR error;
    private boolean success;

    public <T> T handle(Function<BODY, T> successFunction, Function<ERROR, T> errorFunction) {
        if (this.success) {
            return successFunction.apply(body);
        } else {
            return errorFunction.apply(error);
        }
    }
}
