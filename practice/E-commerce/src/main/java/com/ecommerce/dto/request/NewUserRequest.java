package com.ecommerce.dto.request;

import lombok.Getter;

@Getter
public class NewUserRequest {
	
  private	String firstname;
  private 	String lastname;
  private   String username;
  private  	String password;
  private   String email;
  private   String phonenumber;
  private   String  city;
  private   String district;
  private  String state;
  private String pincode;
  private String streetAndLandmark;
  private Boolean isAdmin;
}
