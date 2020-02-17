package com.redflag.project.user;

import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean validateUser(UUID id, String password) {
        Optional<User> user = userRepository.findById(id);
        return false;
    }

    public User createUser(UserRequest userRequest) {
        User user = new User();
        user.setAddress(userRequest.getAddress());
        user.setEmail(userRequest.getEmail());
        user.setFirstName(userRequest.getFirstName());
        user.setLastName(userRequest.getLastName());
        user.setPhoneNumber(userRequest.getPhoneNumber());

        return userRepository.save(user);
    }
}
