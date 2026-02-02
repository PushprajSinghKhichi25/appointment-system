package com.appointmentsystem.repository;

import com.appointmentsystem.entity.User;
import com.appointmentsystem.enums.Role;
import org.springframework.data.jpa.repository.JpaRepository;
// Imports Optional to safely handle cases where a user may not exist.
import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    List<User> findByRole(Role role);

    boolean existsByEmail(String email);
}
