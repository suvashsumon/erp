package com.brainstation23.erp.persistence.repository;

import com.brainstation23.erp.persistence.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
