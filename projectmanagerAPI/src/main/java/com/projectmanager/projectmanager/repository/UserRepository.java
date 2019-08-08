package com.projectmanager.projectmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projectmanager.projectmanager.model.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Long>{

	
}
