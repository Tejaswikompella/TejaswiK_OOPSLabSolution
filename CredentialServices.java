 package com.greatlearning.service;

import java.util.Random;


import com.greatlearning.model.Employee;

   public class CredentialServices {
	   
      public String generateEmail(String firstname,String lastname,String department)	
       {
	     String Email= firstname + lastname + "@" +department+ ".abc.com";
	     return Email;
       }
	
       public char[] generatePassword()
       {
    	   String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    	   String smallLetters ="abcdefghijklmnopqrstuvwxyz";
    	   String numbers = "0123456789";
    	   String specialCharaters = "!@#$%^&*_=+-/.?<>)[";
    	  
    	   String Values = capitalLetters+smallLetters+numbers+specialCharaters;
    	
    	   Random r = new Random();
    	   
    	   char[] Password = new char[8];
    	   
    	   for (int i=0;i<8;i++)
    	   {
    		   Password[i] = Values.charAt(r.nextInt(Values.length()));
    	   }
    	   return Password;
       }
       
      public void showCredentials(Employee e, String email, char[] password )
      {
    	  System.out.println("Dear " + e.getFirstName() +" "+ e.getLastName() + " your generated credentials are as follows ");
    	  System.out.println("Email: "+ email);
    	  System.out.print("Password:"+" ");
    	  System.out.println(password);
      }
}
