package com.securefileshare.backend.repository;

import com.securefileshare.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByUsername(String username);
    java.util.Optional<User> findByUsername(String username);
}
