package com.syntax.class12;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		/*
		 * Store username, password and confirm password from a user and check following
		 * requirements: Username and Password cannot be empty, if so→ message=”Username
		 * and Password cannot be empty”. Password should be minimum 8 characters, if
		 * less → message=”Password is too short”. Password cannot contain username if
		 * so, → message=”Password cannot contain username”. Password should match
		 * confirmed password, if not → message=“Passwords do not match”. Only after all
		 * requirements met → message “Your username and password has been created”
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter your username and password");
		System.out.println("Username: ");
		String userName = scanner.next();
		System.out.println("Password: ");
		String password = scanner.next();
		System.out.println("Please re-enter your password: ");
		String confirmPassword = scanner.next();

		if (!userName.isEmpty() && !password.isEmpty()) { // during the debug mode, if I choose a method let's say
															// "!userName.isEmpty()" and right click then click on
															// watch, I can see its value. Whether it is true or false.
			if (password.length() < 8) {
				System.out.println("Password is too short!");
			} else if (password.contains(userName)) {
				System.out.println("Password cannot contain username");
			} else if (!confirmPassword.equals(password)) {
				System.out.println("Passwords do not match.");
			} else {
				System.out.println("Your username and password has been created.");
			}
		} else {
			System.out.println("Username and Password cannot be empty");
		}

	}

}
