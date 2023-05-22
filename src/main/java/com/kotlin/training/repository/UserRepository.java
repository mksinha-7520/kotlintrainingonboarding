package com.kotlin.training.repository;

import com.kotlin.training.enity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {
}
