/**
 * 
 */
package Controller;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.*;

import Service.*;
import Dao.*;
import Model.*;
public class Main {
	
	
//	static Map<Integer,User> map= new HashMap<Integer,User>();
//	CRUDOperations crud=new CRUDOperations();
	
	public static void main(String[] args) throws Exception
	{
		LocalDateTime myDateObj = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	System.out.println("Good morning today's Date is:"+myDateObj.format(myFormatObj));	
	System.out.println("==============================================================");	
	System.out.println("                EMPLOYEE EXPENSE MANAGER");
	System.out.println("==============================================================");
	System.out.println("Select your login");
	Scanner sc = new Scanner(System.in);
	FirstClass fc = new FirstClass();
//	CRUDOperations crud=new CRUDOperations();
	User user= null;
	while(true) {
		System.out.println("1. MANAGER");
		System.out.println("2. EMPLOYEE");
		System.out.println("3. EXIT");
		System.out.println("==============================");
		String username;
		String mobileno;
		String password;
		String Em_id;
//		User user = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice = sc.nextInt();
		ValidateUserFields validate = new ValidateUserFields();
		switch(choice){
			case 1:
				System.out.println("Enter username: ");
				username = sc.next();
				System.out.println("Enter password: ");
				password = sc.next();
				if(validate.adminlogin(username,password) ) {
					System.out.println("LOGIN SUCCESFULL!");
					fc.admin();
				}
				else 
					System.out.println("Check your username and password");
					System.out.println("================");
				break;
			case 2:
				fc.Myemployee();
				break;
			default:
				System.out.println("Wrong Choice!!");
				break;	
			
			}
		}
	}
}