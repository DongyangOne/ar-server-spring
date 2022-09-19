package dmu.one.arspringserver.user.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserRequest {
    private String email;
    private String password;
    private String name;
}
