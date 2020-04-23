package Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;


import Model.*;
import utility.ConnectionManager;
public class EmployeeOperations {

//Insert Employee details
	public void Insert(Employee employee) throws Exception {
			
			Connection con = ConnectionManager.getConnection();
			String sql = "INSERT INTO employee(Em_id,Em_name,Em_mobile,Em_email,Em_dept)VALUES(?,?,?,?,?)";
			PreparedStatement st1 = con.prepareStatement(sql);

			st1.setString(1, employee.getEm_id());
			st1.setString(2,employee.getEm_name());
			st1.setString(3,employee.getEm_mobile());
			st1.setString(4, employee.getEm_email());
			st1.setString(5,employee.getEm_dept());
			st1.executeUpdate();
			con.close();
		}

//Delete Employee Details
	public void deleteEmployee(String Em_id) {
		try {
			boolean del;
		Connection con = ConnectionManager.getConnection();
		PreparedStatement st= con.prepareStatement("DELETE FROM employee WHERE id = ?");
		st.setString(1, Em_id);
	    del = st.executeUpdate()>0;
		if(del==true)
			System.out.println("Employee ID = "+Em_id+" Deleted Successfully!");
		else
			System.out.println("Incorrect ID!");
	    
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	

//Update Employee Details
	public void updateEmployee(String Em_id) {
		try {
		boolean up;
		Scanner sc = new Scanner(System.in);
		Connection con = ConnectionManager.getConnection();
		PreparedStatement st= con.prepareStatement("UPDATE employee SET Em_dept = ?, Em_name = ?, Em_mobile= ?,Em_email=? WHERE id = ?");
		System.out.print("Edit Employee Department : ");
		String Em_dept = sc.next();
		System.out.print("Edit Employee name : ");
		String Em_name = sc.next();
		System.out.print("Edit Employee mobile : ");
		String Em_mobile = sc.next();
		System.out.print("Edit Employee email : ");
		String Em_email = sc.next();
		st.setString(5, Em_dept);
		st.setString(2, Em_name);
		st.setString(3, Em_mobile);
		st.setString(4, Em_email);
		st.setString(1, Em_id);
		up = st.executeUpdate()>0;
		if(up==true)
			System.out.println("Employee ID = "+Em_id+" Updated Successfully!");
		else
			System.out.println("Incorrect ID!");
	    
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	


	public void getAllEmployee(){
		try {
		Connection con = ConnectionManager.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM employee");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4)+"\t\t"+rs.getString(5));
		}
		
		con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}