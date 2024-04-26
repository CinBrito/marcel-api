package tech.ada.marcel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.ada.marcel.model.User;
import tech.ada.marcel.repository.UserRepository;
import tech.ada.marcel.service.exceptions.DuplicateDataException;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User save(User user) {
        if (userRepository.findByEmail(user.getEmail()) != null) {
            throw new DuplicateDataException("User already exists");
        }

        return userRepository.save(user);
    }

    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
