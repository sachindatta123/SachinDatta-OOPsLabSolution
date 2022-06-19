package com.gl.ITSupportAdministrator.Driver;
import java.util.Scanner;
import  com.gl.ITSupportAdministrator.pojo.Employee;
import com.gl.ITSupportAdministrator.Services.Services;

public class Driver {
	public static String department = null;

	public static void main(String[] args) {
		Employee employee=new Employee("sachin","datta");
		System.out.println("Please Enter The Department from the following: ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		Scanner sc=new Scanner(System.in);
		System.out.println("Please provide appropriate option: ");
		int option =sc.nextInt();
		Services service=new Services();
		
		switch(option) {
		
		case 1:
			department="Technical";
			break;
			
		case 2:
			department="Admin";
			break;
			
		case 3:
			department="HR";
			break;
			
		case 4:
			department="Legal";
			break;
			
		default:
			System.out.println("invalid option");
				
			if (option==1 || option==2 || option==3 ||option==4) {
				System.out.println("Dear "+employee.getfirstName() + " Your generated credentials are as follows " );
				System.out.println("Email --> "+service.generateEmail(employee,department));
				char[] password1=service.generatePassword();
				System.out.println("Password --> 1"+password1);
			}
		}
	}
	}

