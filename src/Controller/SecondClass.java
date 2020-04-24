package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

//import com.itextpdf.text.DocumentException;
import Dao.*;
import Dao.EmployeeOperations;
import Dao.LeaveOperations;
import Dao.SalaryOperations;
import Model.Employee;
import Model.Leave;
import Model.Salary;

public class SecondClass {
	Scanner sc = new Scanner(System.in);
	ExtraDao hel= new ExtraDao();
	void man_emp() {
	System.out.println("=======================");
	int choice;
	do {
	System.out.println("Choose from given options");
	System.out.println("1. ADD EMPLOYEE");
	System.out.println("2. UPDATE EMPLOYEE");
	System.out.println("3. FIRE EMPLOYEE");
	System.out.println("4. EMPLOYEE DETAILS");
	System.out.println("5. SEARCH EMPLOYEE");
	System.out.println("6. SORT EMPLOYEE");
	System.out.println("7. Exit");
	
	String Em_id;
	String Em_name;
	String Em_mobile;
	String Em_email;
	String Em_dept;
	
	Employee employee= null;
	
	
	EmployeeOperations ins = new EmployeeOperations();
	
	choice = sc.nextInt();
	switch(choice) {
	
	case 1:
		// enter all employee details through console
		System.out.println("Enter Employee id");
		Em_id = sc.next();
		System.out.println("Enter Employee name");
		Em_name = sc.next();
		System.out.println("Enter Department");
		Em_dept = sc.next();
		System.out.println("Enter mobile");
		Em_mobile = sc.next();
		System.out.println("Enter email");
		Em_email= sc.next();
		employee= new Employee(Em_id, Em_name,Em_mobile,Em_email,Em_dept);
		try {
			ins.Insert(employee);
		} catch (Exception e) {
		
			e.getMessage();
		}
		System.out.println("Added Successfully!");
		break;
	case 2:
		System.out.println("*----------------------------------------*");
		System.out.println("         Update Employee Details        ");
		System.out.println("*----------------------------------------*");
		System.out.print("Enter Employee ID You Wants to Delete : ");
		Em_id = sc.next();
		ins.updateEmployee(Em_id);
		break;
	case 3: 
		// deleting employee records
		System.out.println("*----------------------------------------*");
		System.out.println("         Delete Employee Details        ");
		System.out.println("*----------------------------------------*");
		System.out.print("Enter Employee ID You Wants to Delete : ");
		Em_id = sc.next();
		ins.deleteEmployee(Em_id);
		break;
	case 4:
		// getting employee details on console
		System.out.println("*----------------------------------------*");
		System.out.println("           Employee Details               ");
		System.out.println("*----------------------------------------*");
		System.out.println("Id         Employee_Name     Mobile      email          dept");
		System.out.println("*----------------------------------------*");
		ins.getAllEmployee();
		System.out.println("*----------------------------------------*");
		break;
	case 5:
		// getting employee details on console
		System.out.println("Enter Employee name you want to search");
		Em_name=sc.next();
		System.out.println("*----------------------------------------*");
		System.out.println("           Employee's Detail               ");
		System.out.println("*----------------------------------------*");
		System.out.println("Id         Employee_Name     Mobile      email          dept");
		System.out.println("*----------------------------------------*");
		hel.DispEmp(Em_name);
		System.out.println("*----------------------------------------*");
		break;
	case 6:
		// getting employee details on console
		System.out.println("1. Sort in Ascending");
		System.out.println("2. Sort in Descending");
		int srt=sc.nextInt();
		System.out.println("*----------------------------------------*");
		System.out.println("           Employee's Detail               ");
		System.out.println("*----------------------------------------*");
		System.out.println("Id         Employee_Name     Mobile      email          dept");
		System.out.println("*----------------------------------------*");
		if(srt==1) {
			hel.getAllAscEmployee();
		
		}
		else if(srt==2) {
			hel.getAllDscEmployee();
			
		}
		else {
			break;
			}
	
		System.out.println("*----------------------------------------*");
		break;
		

default:
		System.out.println("Wrong input");
		break;
		
	}
}while(choice!=7);
}
	
	
	void man_lea() {
		System.out.println("=======================");
		int choice;
		do{
		System.out.println("Choose from given options");
		System.out.println("1. ADD LEAVE");
		System.out.println("2. UPDATE LEAVE");
		System.out.println("3. DELETE LEAVE");
		System.out.println("4. LEAVE DETAILS");
		System.out.println("5. Exit");
		
		String Lid;
		String Ltype;
		String FromDate;
		String Lstatus;
		String Em_id;
		
		Leave leave= null;
		
		
		LeaveOperations leo = new LeaveOperations();
		choice = sc.nextInt();
		switch(choice) {
		
		case 1:
			// enter all employee details through console
			System.out.println("Enter Leave id");
			Lid = sc.next();
			System.out.println("Enter Leave type");
			Ltype = sc.next();
			System.out.println("Enter From Date (dd-mm-yy)");
			FromDate = sc.next();
			System.out.println("Enter Leave Status");
			Lstatus = sc.next();
			System.out.println("Enter Employee id");
			Em_id= sc.next();
			leave= new Leave(Lid, Ltype,FromDate,Lstatus,Em_id);
			try {
				leo.Insert(leave);
			} catch (Exception e) {
			
				e.getMessage();
			}
			System.out.println("Added Successfully!");
			break;
		case 2:
			System.out.println("*----------------------------------------*");
			System.out.println("         Update Leave Details        ");
			System.out.println("*----------------------------------------*");
			System.out.print("Enter Employee ID You Wants to Delete : ");
			Lid = sc.next();
			leo.updateLeave(Lid);
			break;
		case 3: 
			// deleting employee records
			System.out.println("*----------------------------------------*");
			System.out.println("         Delete Leave Details        ");
			System.out.println("*----------------------------------------*");
			System.out.print("Enter Employee ID You Wants to Delete : ");
			Lid = sc.next();
			leo.deleteLeave(Lid);
			break;
		case 4:
			// getting employee details on console
			System.out.println("*----------------------------------------*");
			System.out.println("           Leave Details               ");
			System.out.println("*----------------------------------------*");
			System.out.println("LId        Leave type      FromDate      LeaveStatus         Em_id");
			System.out.println("*----------------------------------------*");
			leo.getAllLeave();
			System.out.println("*----------------------------------------*");
			break;
	default:
			System.out.println("Wrong input");
			break;
			
		}
	}while(choice!=5);

}
	
		void man_sal()
		{	System.out.println("=======================");
			int choice;
			do {
				System.out.println("Choose from given options");
				System.out.println("1. ADD SALARY");
				System.out.println("2. UPDATE SALARY");
				System.out.println("3. DELETE SALARY");
				System.out.println("4. SALARY DETAILS");
				System.out.println("5. SEARCH SALARY");
				System.out.println("6. SORT SALARY");
				System.out.println("7. Exit");
				
				String Sid;
				String DateDis;
				String Amount;
				String Em_id;
				String Expense;

				
			Salary sal= null;
				
				
				SalaryOperations Salo = new SalaryOperations();
				choice = sc.nextInt();
				switch(choice) {
				
				case 1:
					// enter all employee details through console
					System.out.println("Enter Salary id");
					Sid = sc.next();
					System.out.println("Enter Salary Date(dd-mm-yyyy)");
					DateDis = sc.next();
					System.out.println("Enter Amount");
					Amount = sc.next();
					System.out.println("Enter Employee id");
					Em_id= sc.next();
					System.out.println("Enter Expense");
					Expense= sc.next();
					sal= new Salary(Sid, DateDis,Amount,Em_id,Expense);
					try {
						Salo.Insert(sal);
					} catch (Exception e) {
					
						e.getMessage();
					}
					System.out.println("Added Successfully!");
					break;
				case 2:
					System.out.println("*----------------------------------------*");
					System.out.println("         Update Salary Details        ");
					System.out.println("*----------------------------------------*");
					System.out.print("Enter Employee ID You Wants to Delete : ");
					Sid = sc.next();
					Salo.updateSalary(Sid);
					break;
				case 3: 
					// deleting employee records
					System.out.println("*----------------------------------------*");
					System.out.println("         Delete Salary Details        ");
					System.out.println("*----------------------------------------*");
					System.out.print("Enter Employee ID You Wants to Delete : ");
					Sid = sc.next();
					Salo.deleteSalary(Sid);
					break;
				case 4:
					// getting employee details on console
					System.out.println("*----------------------------------------*");
					System.out.println("           Salary Details               ");
					System.out.println("*----------------------------------------*");
					System.out.println("SalaryId       Date distributed      Amount         Em_id      Expense        TotSal");
					System.out.println("*----------------------------------------*");
					Salo.getAllSalary();
					System.out.println("*----------------------------------------*");
					break;
				case 5:
					// getting employee details on console
					System.out.println("Enter Salary Id you want to search");
					Sid=sc.next();
					System.out.println("*----------------------------------------*");
					System.out.println("           Salary's Detail               ");
					System.out.println("*----------------------------------------*");
					System.out.println("S_Id         Date_Dis       Amount      Em_id      Expense     TotSal");
					System.out.println("*----------------------------------------*");
					hel.DispSal(Sid);
					System.out.println("*----------------------------------------*");
					break;
				case 6:
					// getting employee details on console
					System.out.println("Enter Salary from");
					String s1= sc.next();
					System.out.println("Enter Salary To");
					String s2 = sc.next();
					System.out.println("*----------------------------------------*");
					System.out.println("            Sorted Salary               ");
					System.out.println("*----------------------------------------*");
					System.out.println("S_Id         Date_Dis       Amount      Em_id      Expense     TotSal");
					System.out.println("*----------------------------------------*");
					hel.SortSal(s1,s2);
			default:
					System.out.println("Wrong input");
					break;
					
				}
			}while(choice!=5);
		}
}
