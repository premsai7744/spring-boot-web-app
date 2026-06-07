package com.premit.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.premit.entity.EcomUser;
import com.premit.repository.EcomUserRepository;



@Service
public class EcomUserService {
	
	@Autowired
	EcomUserRepository ecomUserRepository;
	
	public String registerUser(String userName,String password,String firstName,String lastName,LocalDate dateOfBirth,
	                           String gender,String emailId,long contact) {
		System.out.println("****Data from service : *****");
		System.out.println("userName    : "+userName);
		System.out.println("password    : "+password);
		System.out.println("firstName   : "+firstName);
		System.out.println("lastName    : "+lastName);
		System.out.println("dateOfBirth : "+dateOfBirth);
		System.out.println("gender 		: "+gender);
		System.out.println("emailId 	: "+emailId);
		System.out.println("contact 	: "+contact);
		
		EcomUser ecomUser = new EcomUser();
		ecomUser.setContact(contact);
		ecomUser.setDateOfBirth(dateOfBirth);
		ecomUser.setEmailId(emailId);
		ecomUser.setFirstName(firstName);
		ecomUser.setGender(gender);
		ecomUser.setLastName(lastName);
		ecomUser.setPassword(password);
		ecomUser.setUserName(userName);
		
		if(ecomUserRepository.findById(userName).isPresent()) {
			return "Username : "+userName+" already taken, please try with new one.";
		} else {
			EcomUser savedEntity = ecomUserRepository.save(ecomUser);
			if(savedEntity!=null) {
				return "User registration successfully done. Please login with credentials.";
			} else {
				return "User registration failed!, Please try again.";
			}
		}
	}
	
	public String userLogin(String userName,String password) {
		EcomUser user = ecomUserRepository.findByUserNameAndPassword(userName, password);
		if(user!=null) {
			return "Login successfull for user : "+user.getFirstName();
		} else {
			return "Login failed! Please try again with valid credentials.";
		}
	}
}
