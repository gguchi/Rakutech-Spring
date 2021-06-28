package com.RakutechApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.RakutechApplication.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
