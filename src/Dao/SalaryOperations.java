package Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;


import Model.*;
import utility.ConnectionManager;
public class SalaryOperations {

//Insert Employee details
	public void Insert(Salary sal) throws Exception {
			float c= Float.parseFloat(sal.getAmount());
			float d= Float.parseFloat(sal.getExpense());
			float g= c+d;
			String TotSal= String.valueOf(g);
			
			Connection con = ConnectionManager.getConnection();
			String sql = "INSERT INTO Salary(SID,DATEDIS,AMOUNT,EM_ID,Expense,TotSal)VALUES(?,?,?,?,?,?)";
			PreparedStatement st1 = con.prepareStatement(sql);

			st1.setString(1, sal.getSid());
			st1.setString(2,sal.getDateDis());
			st1.setString(3,sal.getAmount());
			st1.setString(4,sal.getEm_id());
			st1.setString(5,sal.getExpense());
			st1.setString(6,TotSal);
			st1.executeUpdate();
			con.close();
		}

//Delete Employee Details
	public void deleteSalary(String Sid) {
		try {
			boolean del;
		Connection con = ConnectionManager.getConnection();
		PreparedStatement st= con.prepareStatement("DELETE FROM salary WHERE Sid = ?");
		st.setString(1, Sid);
	    del = st.executeUpdate()>0;
		if(del==true)
			System.out.println("Salary ID = "+Sid+" Deleted Successfully!");
		else
			System.out.println("Incorrect ID!");
	    
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	

//Update Employee Details
	public void updateSalary(String Sid) {
		try {
		boolean up;
		Scanner sc = new Scanner(System.in);
		Connection con = ConnectionManager.getConnection();
		PreparedStatement st= con.prepareStatement("UPDATE salary SET DateDis= ?, Amount=?, Em_id =?,Expense=?,TotSal=?  WHERE Sid = ?");
		System.out.print("Edit Salary Date Distributed : ");
		String DateDis = sc.next();
		System.out.print("Edit Amount : ");
		String Amount = sc.next();
		System.out.print("Edit Employee Id : ");
		String Em_id = sc.next();
		System.out.print("Edit Expense : ");
		String Expense = sc.next();
		System.out.print("Edit TotSal : ");
		String TotSal = sc.next();
		st.setString(2, DateDis);
		st.setString(3, Amount);
		st.setString(4, Em_id);
		st.setString(5, Expense);
		st.setString(6, TotSal);
		up = st.executeUpdate()>0;
		if(up==true)
			System.out.println("Salary ID = "+Sid+" Updated Successfully!");
		else
			System.out.println("Incorrect ID!");
	    
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	


//Get all salary details	
	public void getAllSalary(){
		try {
		Connection con = ConnectionManager.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM salary");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4)+"\t\t"+rs.getString(5)+"\t\t"+rs.getString(6));
		}
		
		con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}




}
