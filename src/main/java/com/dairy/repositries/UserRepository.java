package com.dairy.repositries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dairy.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
