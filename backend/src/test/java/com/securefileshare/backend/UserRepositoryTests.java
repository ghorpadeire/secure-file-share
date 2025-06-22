package com.securefileshare.backend;

import com.securefileshare.backend.model.User;
import com.securefileshare.backend.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class UserRepositoryTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    void existsByUsernameReturnsTrueAfterSavingUser() {
        User user = new User("jane", "jane@example.com", "password");
        userRepository.save(user);

        boolean exists = userRepository.existsByUsername("jane");

        assertThat(exists).isTrue();
    }
}
