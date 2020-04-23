package Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;


import Model.*;
import utility.ConnectionManager;
public class LeaveOperations {

//Insert Employee details
	public void Insert(Leave leave) throws Exception {
			
			Connection con = ConnectionManager.getConnection();
			String sql = "INSERT INTO leave(LID,LTYPE,FROMDATE,LSTATUS,EM_ID)VALUES(?,?,?,?,?)";
			PreparedStatement st1 = con.prepareStatement(sql);

			st1.setString(1, leave.getLid());
			st1.setString(2,leave.getLtype());
			st1.setString(3,leave.getFromDate());
			st1.setString(4, leave.getLstatus());
			st1.setString(5,leave.getEm_id());
			st1.executeUpdate();
			con.close();
		}

//Delete Employee Details
	public void deleteLeave(String Lid) {
		try {
			boolean del;
		Connection con = ConnectionManager.getConnection();
		PreparedStatement st= con.prepareStatement("DELETE FROM employee WHERE Lid = ?");
		st.setString(1, Lid);
	    del = st.executeUpdate()>0;
		if(del==true)
			System.out.println("Leave ID = "+Lid+" Deleted Successfully!");
		else
			System.out.println("Incorrect ID!");
	    
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	

//Update Employee Details
	public void updateLeave(String Lid) {
		try {
		boolean up;
		Scanner sc = new Scanner(System.in);
		Connection con = ConnectionManager.getConnection();
		PreparedStatement st= con.prepareStatement("UPDATE leave SET Ltype = ?, FromDate= ?,Lstatus=?,Em_id =? WHERE Lid = ?");
		System.out.print("Edit Leave type : ");
		String Ltype = sc.next();
		System.out.print("Edit FromDate : ");
		String FromDate = sc.next();
		System.out.print("Edit Leave Status : ");
		String Lstatus = sc.next();
		System.out.print("Edit Employee Id : ");
		String Em_id = sc.next();
		st.setString(1,Lid);
		st.setString(2, Ltype);
		st.setString(3, FromDate);
		st.setString(4, Lstatus);
		st.setString(5, Em_id);
		up = st.executeUpdate()>0;
		if(up==true)
			System.out.println("Leave ID = "+Lid+" Updated Successfully!");
		else
			System.out.println("Incorrect ID!");
	    
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	


	public void getAllLeave(){
		try {
		Connection con = ConnectionManager.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM leave");
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
