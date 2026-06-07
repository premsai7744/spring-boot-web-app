package com.premit.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.premit.service.EcomUserService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class WelcomeController {
	
	@Autowired
	EcomUserService ecomUserService;
	
	@RequestMapping(path = "/ecommerce")
	public String loadWelcomePage() {
		return "Welcome";
	}
	
	@RequestMapping(path="/user/register", method = RequestMethod.GET)
	public String loadUserRegistrationPage() {
		return "UserRegistration";
	}
	
	@RequestMapping(path="/user/create/account", method=RequestMethod.POST)
	public ModelAndView userRegistration(HttpServletRequest request) {
		String userName = request.getParameter("uName");
		String password = request.getParameter("pword");
		String firstName = request.getParameter("fName");
		String lastName = request.getParameter("lName");
		String dateOfBirth = request.getParameter("dob");
		String gender = request.getParameter("gender");
		String emailId = request.getParameter("email");
		String contact = request.getParameter("contact");
		
		System.out.println("Printing request data : ");
		System.out.println("userName    : "+userName);
		System.out.println("password    : "+password);
		System.out.println("firstName   : "+firstName);
		System.out.println("lastName    : "+lastName);
		System.out.println("dateOfBirth : "+dateOfBirth);
		System.out.println("gender 		: "+gender);
		System.out.println("emailId 	: "+emailId);
		System.out.println("contact 	: "+contact);
		
		LocalDate parsedDateOfBirth = LocalDate.parse(dateOfBirth);
		Long parsedContact = Long.parseLong(contact);
		
		String result = ecomUserService.registerUser(userName, password, firstName, lastName, parsedDateOfBirth, gender, emailId, parsedContact);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("Result");
		modelAndView.addObject("result", result);
		
		return modelAndView;
	}
	
	@RequestMapping(path = "/user/login",method=RequestMethod.POST)
	public ModelAndView userLogin(HttpServletRequest request) {
		System.out.println("****userLogin() method****");
		String uName = request.getParameter("uname");
		String pWord = request.getParameter("pword");
		System.out.println("Username : "+uName);
		System.out.println("Password : "+pWord);
		
		String result = ecomUserService.userLogin(uName, pWord);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("Result2");
		modelAndView.addObject("result", result);
		
		return modelAndView;
	}
}


























