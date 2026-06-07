package com.premit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.premit.entity.EcomUser;

@Repository
public interface EcomUserRepository extends JpaRepository<EcomUser, String>{
	
	EcomUser findByUserNameAndPassword(String userName,String password);
}
