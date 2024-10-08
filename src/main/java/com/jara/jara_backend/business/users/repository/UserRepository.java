package com.jara.jara_backend.business.users.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jara.jara_backend.business.users.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

//    Optional<User> findByUserId(Long userId);
    Optional<User> findUserById(Long userId);

}
