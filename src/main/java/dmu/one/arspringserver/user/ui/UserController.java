package dmu.one.arspringserver.user.ui;

import dmu.one.arspringserver.user.application.UserService;
import dmu.one.arspringserver.user.domain.User;
import dmu.one.arspringserver.user.dto.UserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping()
    public User save(UserRequest req) {
        return this.userService.save(req);
    }

    @GetMapping()
    public List<User> findAll() {
        return this.userService.findAll();
    }

    @GetMapping("/{idx}")
    public Optional<User> findByIdx(@PathVariable(name = "idx") Long idx) {
        return this.userService.findByIdx(idx);
    }
}
