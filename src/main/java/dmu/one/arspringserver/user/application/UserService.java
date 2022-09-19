package dmu.one.arspringserver.user.application;

import dmu.one.arspringserver.user.domain.User;
import dmu.one.arspringserver.user.dto.UserRequest;
import dmu.one.arspringserver.user.infrastructure.UserJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserJpaRepository userJpaRepository;


    public User save(UserRequest req) {
        User user = new User(req.getEmail(), req.getPassword(), req.getName());
        return this.userJpaRepository.save(user);
    }

    public Optional<User> findByIdx(Long idx){
        return this.userJpaRepository.findById(idx);
    }

    public List<User> findAll(){
        return this.userJpaRepository.findAll();
    }
}
