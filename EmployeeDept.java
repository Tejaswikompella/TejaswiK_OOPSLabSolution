package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialServices;

public class EmployeeDept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = new Employee("Tejaswi","K");
		CredentialServices cs = new CredentialServices();
		String generatedEmail;
		char[] generatedPassword;
		
		System.out.println("Please Enter the Department from following");
		System.out.println("1.Techinal");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		
		if (option == 1)
		{
			generatedEmail = cs.generateEmail(e.getFirstName().toLowerCase(),e.getLastName().toLowerCase(),"tech");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(e, generatedEmail, generatedPassword);
		}
		
		else if (option == 2)
		{
			generatedEmail = cs.generateEmail(e.getFirstName().toLowerCase(),e.getLastName().toLowerCase(),"admin");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(e, generatedEmail,generatedPassword);
		}
		
		else if (option == 3)
		{
			generatedEmail = cs.generateEmail(e.getFirstName().toLowerCase(),e.getLastName().toLowerCase(),"hr");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(e, generatedEmail, generatedPassword);
		}
		
		else if (option == 4)
		{
			generatedEmail = cs.generateEmail(e.getFirstName().toLowerCase(),e.getLastName().toLowerCase(),"legal");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(e, generatedEmail, generatedPassword);
		}
		
		else
		{
			System.out.println("Enter a valid option");
			sc.close();
		}
	}	
}
