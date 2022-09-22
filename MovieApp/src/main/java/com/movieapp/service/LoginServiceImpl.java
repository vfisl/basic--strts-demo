package com.movieapp.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class LoginServiceImpl implements ILoginService {

	@Override
	public boolean validateUsername(String username , String password1) {
		String usernames[]= {"John","Sri","Priya","Rahul","Joe"};
		String passowrd="abc123";
		return Stream.of(usernames)
				.filter(str->str.equals(username)).findFirst().isPresent()&&passowrd.equals(password1);
	}

}
