package Controller;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.itextpdf.text.DocumentException;

//import com.itextpdf.text.DocumentException;

import Model.*;
import Dao.*;

public class FirstClass {

	Scanner sc = new Scanner (System.in);
	ConvertToPDF pdf =new ConvertToPDF();
	SecondClass sec = new SecondClass();
	
//Admin function
	void admin() {
		
		System.out.println("=======================");
		int choice;
		do {
		System.out.println("Choose from given options");
		System.out.println("1. Manage Employee");
		System.out.println("2. Manage Leave ");
		System.out.println("3. Manage Salary & Expense");
		System.out.println("4. Exit");
		
		
		choice = sc.nextInt();
		switch(choice) {
		
		case 1:
			sec.man_emp();
			break;
		case 2:
			sec.man_lea();
			break;
		case 3: 
			sec.man_sal();
			break;
			
		
	default:
			System.out.println("Wrong input");
			break;
			
		}
	}while(choice!=4);
	}
// Employee function
void Myemployee() throws ClassNotFoundException, FileNotFoundException, SQLException, DocumentException
	 {	User user =null;
		DisplayEmp disp = new DisplayEmp();
		System.out.println("=======================");
		int choice;
		do {
		System.out.println("Choose from given options");
		System.out.println("1. All Details");
		System.out.println("2. PDF ");
		System.out.println("3. Exit");
		
		
		choice = sc.nextInt();
		switch(choice) {
		
		case 1:System.out.println("Enter Mobile no.");
		String mobile = sc.next();
		System.out.println("Enter Employee id");
		String Em_id= sc.next();
		user= new User(mobile,Em_id);
		System.out.println("Your detail");
		System.out.println("Em_id		Em_name		Em_mobile	Em_email 		Em_dept");
		try {
			disp.DispEmp(user.getMobile());
		} catch (Exception e) {
		
			e.getMessage();
		}
		System.out.println("Your salary detail");
		System.out.println("Sid		DateDis		Amount		Em_id		Expense		TotSal");
		try {
			disp.DispSal(user.getEm_id());
		} catch (Exception e) {
		
			e.getMessage();
		}
		System.out.println("Your leave detail");
		System.out.println("Lid		Type	FromDate		Status   	Em_id");
		try {
			disp.DispLeav(user.getEm_id());
		} catch (Exception e) {
		
			e.getMessage();
		}
		System.out.println("Thankyou");
		break;
		case 2:
			System.out.println("Enter your Em_id");
			Em_id= sc.next();
			System.out.println("Enter your name");
			String name = sc.next();
			System.out.println("Your Salary Detail in pdf generated");
			pdf.ConverToPDF(Em_id,name);
			
			break;
	
			
		
	default:
			System.out.println("Wrong input");
			break;
			
		}
	}while(choice!=3);
	 }
}