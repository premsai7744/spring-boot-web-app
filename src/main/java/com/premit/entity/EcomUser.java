package com.premit.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="ecom_user")
public class EcomUser {
	
	@Id
	@Column(name="u_name")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="f_name")
	private String firstName;
	
	@Column(name="l_name")
	private String lastName;
	
	@Column(name="dob")
	private LocalDate dateOfBirth;
	
	@Column(name="gndr")
	private String gender;
	
	@Column(name="e_id")
	private String emailId;
	
	@Column(name="contact")
	private long contact;
	
}
