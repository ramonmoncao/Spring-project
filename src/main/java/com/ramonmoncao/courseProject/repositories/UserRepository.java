package com.ramonmoncao.courseProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramonmoncao.courseProject.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
		

}
