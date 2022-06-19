package com.gl.ITSupportAdministrator.Services;
import java.util.Random;
import com.gl.ITSupportAdministrator.pojo.Employee;

public class Services {
	
	public char[] generatePassword() {
		String capitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters="abcdefghijklmnopqrstuvwxyz";
		String Numbers="0123456789";
		String specialCharecters="!@#$%^&*()_+{}][.,?><" ;
		String values=capitalLetters+smallLetters+Numbers+specialCharecters;
		
		Random random=new Random();
		char[] password=new char[8];
		
		for (int i=0; i<8; i++) {
			password[i] = values.charAt(random.nextInt(values.length()));
		}
		return password;
	}
	
	Employee employee=new Employee();
	public String generateEmail(Employee employee,String department) {
		return employee.getfirstName()+employee.getlastName()+"@"+department+".TCS.com";
	}
	
	public Employee getEmployee() {
		return employee;
	}
}
