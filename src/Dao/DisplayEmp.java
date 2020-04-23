package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import utility.ConnectionManager;

public class DisplayEmp {
	
	
	
	public void DispEmp(String mobileno){
		try {
		
		Connection con = ConnectionManager.getConnection();
		PreparedStatement st = con.prepareStatement("SELECT Em_id,Em_name,Em_mobile,Em_email,Em_dept FROM employee WHERE Em_mobile =?");
		st.setString(1, mobileno);
	
		ResultSet rs = st.executeQuery();

		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4)+"\t\t"+rs.getString(5)+"\t\t");
		}
		con.close();		
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void DispLeav(String Em_id ) 
	{
		try {
			
			Connection con = ConnectionManager.getConnection();
			PreparedStatement st = con.prepareStatement("SELECT * FROM leave WHERE Em_id =?");
			st.setString(1, Em_id);
		
			ResultSet rs = st.executeQuery();

			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4)+"\t\t"+rs.getString(5));
			}
			con.close();		
			} catch (Exception e) {
				System.out.println(e);
			}

	}
	public void DispSal(String Em_id) 
	{
		try {
		
			Connection con = ConnectionManager.getConnection();
			PreparedStatement st = con.prepareStatement("SELECT * FROM salary WHERE Em_id=?");
			st.setString(1, Em_id);
			
			ResultSet rs = st.executeQuery();

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
