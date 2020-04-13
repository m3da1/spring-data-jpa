package com.m3d.dev.springdata.repositories;

import com.m3d.dev.springdata.entities.Users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends JpaRepository<Users, Long>{

	Users findByName(String name);

}